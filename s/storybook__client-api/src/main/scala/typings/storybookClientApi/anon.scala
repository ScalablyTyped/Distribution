package typings.storybookClientApi

import typings.std.Record
import typings.storybookClientApi.distTs3Dot9TypesMod._StorySpecifier
import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndexEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GlobalTypes extends StObject {
    
    var globalTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ] = js.undefined
    
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
  }
  object GlobalTypes {
    
    inline def apply(): GlobalTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalTypes] (val x: Self) extends AnyVal {
      
      inline def setGlobalTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
      ): Self = StObject.set(x, "globalTypes", value.asInstanceOf[js.Any])
      
      inline def setGlobalTypesUndefined: Self = StObject.set(x, "globalTypes", js.undefined)
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
  
  trait Globals extends StObject {
    
    var globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  }
  object Globals {
    
    inline def apply(
      globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Globals = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Globals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Globals] (val x: Self) extends AnyVal {
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportFn extends StObject {
    
    var importFn: ModuleImportFn
  }
  object ImportFn {
    
    inline def apply(importFn: /* path */ Path => PromiseLike[ModuleExports]): ImportFn = {
      val __obj = js.Dynamic.literal(importFn = js.Any.fromFunction1(importFn))
      __obj.asInstanceOf[ImportFn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportFn] (val x: Self) extends AnyVal {
      
      inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
    }
  }
  
  trait Kind
    extends StObject
       with _StorySpecifier {
    
    var kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
    
    var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
  }
  object Kind {
    
    inline def apply(
      kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any,
      name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
    ): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      inline def setKind(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stories extends StObject {
    
    var stories: Record[String, StoryIndexEntry]
    
    var v: Double
  }
  object Stories {
    
    inline def apply(stories: Record[String, StoryIndexEntry], v: Double): Stories = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stories] (val x: Self) extends AnyVal {
      
      inline def setStories(value: Record[String, StoryIndexEntry]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var storyStore: js.UndefOr[typings.storybookStore.mod.StoryStore[TFramework]] = js.undefined
  }
  object StoryStore {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): StoryStore[TFramework] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryStore[TFramework]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoryStore[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] (val x: Self & StoryStore[TFramework]) extends AnyVal {
      
      inline def setStoryStore(value: typings.storybookStore.mod.StoryStore[TFramework]): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
      
      inline def setStoryStoreUndefined: Self = StObject.set(x, "storyStore", js.undefined)
    }
  }
}
