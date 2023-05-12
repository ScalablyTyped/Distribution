package typings.storybookCsf

import typings.std.Omit
import typings.std.Partial
import typings.storybookCsf.mod.ConditionalTest
import typings.storybookCsf.mod.ConditionalValue
import typings.storybookCsf.mod.PlayFunction
import typings.storybookCsf.mod.PlayFunctionContext
import typings.storybookCsf.mod.Renderer
import typings.storybookCsf.mod.StoryAnnotations
import typings.storybookCsf.mod.StoryName
import typings.storybookCsf.mod.Tag
import typings.storybookCsf.storybookCsfStrings.story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TArgs] extends StObject {
    
    var T: /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, unknown> extends std.Required<TArgs> ? any : TArgs */ js.Any
  }
  object `0` {
    
    inline def apply[TArgs](
      T: /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, unknown> extends std.Required<TArgs> ? any : TArgs */ js.Any
    ): `0`[TArgs] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[TArgs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], TArgs] (val x: Self & `0`[TArgs]) extends AnyVal {
      
      inline def setT(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, unknown> extends std.Required<TArgs> ? any : TArgs */ js.Any
      ): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  trait Arg
    extends StObject
       with ConditionalValue {
    
    var arg: String
  }
  object Arg {
    
    inline def apply(arg: String): Arg = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eq
    extends StObject
       with ConditionalTest {
    
    @JSName("eq")
    var eq_FEq: Any
  }
  object Eq {
    
    inline def apply(eq_ : Any): Eq = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("eq")(eq_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eq]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Eq] (val x: Self) extends AnyVal {
      
      inline def setEq_(value: Any): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exists
    extends StObject
       with ConditionalTest {
    
    var exists: Boolean
  }
  object Exists {
    
    inline def apply(exists: Boolean): Exists = {
      val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exists] (val x: Self) extends AnyVal {
      
      inline def setExists(value: Boolean): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    }
  }
  
  trait Global
    extends StObject
       with ConditionalValue {
    
    var global: String
  }
  object Global {
    
    inline def apply(global: String): Global = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  trait Groups extends StObject {
    
    var groups: js.Array[String]
    
    var root: String | Null
  }
  object Groups {
    
    inline def apply(groups: js.Array[String]): Groups = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], root = null)
      __obj.asInstanceOf[Groups]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
    }
  }
  
  trait Name[TRenderer /* <: Renderer */, TArgs] extends StObject {
    
    /**
      * Override the display name in the UI (CSF v3)
      */
    var name: js.UndefOr[StoryName] = js.undefined
    
    /**
      * Function that is executed after the story is rendered.
      */
    var play: js.UndefOr[PlayFunction[TRenderer, TArgs]] = js.undefined
    
    /** @deprecated */
    var story: js.UndefOr[
        Omit[
          StoryAnnotations[TRenderer, TArgs, Partial[TArgs]], 
          typings.storybookCsf.storybookCsfStrings.story
        ]
      ] = js.undefined
    
    /**
      * Override the display name in the UI (CSF v2)
      */
    var storyName: js.UndefOr[StoryName] = js.undefined
    
    /**
      * Named tags for a story, used to filter stories in different contexts.
      */
    var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  }
  object Name {
    
    inline def apply[TRenderer /* <: Renderer */, TArgs](): Name[TRenderer, TArgs] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name[TRenderer, TArgs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name[?, ?], TRenderer /* <: Renderer */, TArgs] (val x: Self & (Name[TRenderer, TArgs])) extends AnyVal {
      
      inline def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlay(value: /* context */ PlayFunctionContext[TRenderer, TArgs] => js.Promise[Unit] | Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setStory(value: Omit[StoryAnnotations[TRenderer, TArgs, Partial[TArgs]], story]): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setStoryName(value: StoryName): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
      
      inline def setStoryNameUndefined: Self = StObject.set(x, "storyName", js.undefined)
      
      inline def setStoryUndefined: Self = StObject.set(x, "story", js.undefined)
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait Neq
    extends StObject
       with ConditionalTest {
    
    var neq: Any
  }
  object Neq {
    
    inline def apply(neq: Any): Neq = {
      val __obj = js.Dynamic.literal(neq = neq.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neq]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Neq] (val x: Self) extends AnyVal {
      
      inline def setNeq(value: Any): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecondPass extends StObject {
    
    var secondPass: js.UndefOr[Boolean] = js.undefined
  }
  object SecondPass {
    
    inline def apply(): SecondPass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecondPass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecondPass] (val x: Self) extends AnyVal {
      
      inline def setSecondPass(value: Boolean): Self = StObject.set(x, "secondPass", value.asInstanceOf[js.Any])
      
      inline def setSecondPassUndefined: Self = StObject.set(x, "secondPass", js.undefined)
    }
  }
  
  trait T[TArgs] extends StObject {
    
    var T: TArgs
  }
  object T {
    
    inline def apply[TArgs](T: TArgs): T[TArgs] = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any])
      __obj.asInstanceOf[T[TArgs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: T[?], TArgs] (val x: Self & T[TArgs]) extends AnyVal {
      
      inline def setT(value: TArgs): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  trait TAny extends StObject {
    
    var T: Any
  }
  object TAny {
    
    inline def apply(T: Any): TAny = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any])
      __obj.asInstanceOf[TAny]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TAny] (val x: Self) extends AnyVal {
      
      inline def setT(value: Any): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  trait Truthy
    extends StObject
       with ConditionalTest {
    
    var truthy: js.UndefOr[Boolean] = js.undefined
  }
  object Truthy {
    
    inline def apply(): Truthy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Truthy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Truthy] (val x: Self) extends AnyVal {
      
      inline def setTruthy(value: Boolean): Self = StObject.set(x, "truthy", value.asInstanceOf[js.Any])
      
      inline def setTruthyUndefined: Self = StObject.set(x, "truthy", js.undefined)
    }
  }
}
