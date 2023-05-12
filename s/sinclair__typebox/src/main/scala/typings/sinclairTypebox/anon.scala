package typings.sinclairTypebox

import org.scalablytyped.runtime.StringDictionary
import typings.sinclairTypebox.mod.TLiteral
import typings.sinclairTypebox.mod.TModifier
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TString
import typings.sinclairTypebox.mod.TUnknown
import typings.sinclairTypebox.sinclairTypeboxStrings.delete
import typings.sinclairTypebox.sinclairTypeboxStrings.insert
import typings.sinclairTypebox.sinclairTypeboxStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject
  
  @js.native
  trait `1` extends StObject
  
  @js.native
  trait Modifier extends StObject
  
  trait NotNot[Not /* <: TSchema */] extends StObject {
    
    var not: Not
  }
  object NotNot {
    
    inline def apply[Not /* <: TSchema */](not: Not): NotNot[Not] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotNot[Not]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotNot[?], Not /* <: TSchema */] (val x: Self & NotNot[Not]) extends AnyVal {
      
      inline def setNot(value: Not): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params[P /* <: js.Array[Any] */] extends StObject {
    
    var params: P
  }
  object Params {
    
    inline def apply[P /* <: js.Array[Any] */](params: P): Params[P] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params[?], P /* <: js.Array[Any] */] (val x: Self & Params[P]) extends AnyVal {
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: TString
    
    var `type`: TLiteral[insert]
    
    var value: TUnknown
  }
  object Path {
    
    inline def apply(path: TString, `type`: TLiteral[insert], value: TUnknown): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: TString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: TLiteral[insert]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TUnknown): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathType extends StObject {
    
    var path: TString
    
    var `type`: TLiteral[delete]
  }
  object PathType {
    
    inline def apply(path: TString, `type`: TLiteral[delete]): PathType = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathType] (val x: Self) extends AnyVal {
      
      inline def setPath(value: TString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: TLiteral[delete]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @sinclair/typebox.@sinclair/typebox.TOptional<@sinclair/typebox.@sinclair/typebox.TSchema> */
  @js.native
  trait TOptionalTSchema
    extends StObject
       with /* prop */ StringDictionary[Any]
       with TModifier {
    
    /** Default value for this schema */
    var default: js.UndefOr[Any] = js.native
    
    /** Id for this schema */
    @JSName("$id")
    var $id: js.UndefOr[String] = js.native
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    /** Description of this schema */
    var description: js.UndefOr[String] = js.native
    
    /** Example values matching this schema */
    var examples: js.UndefOr[Any] = js.native
    
    var params: js.Array[Any] = js.native
    
    var static: Any = js.native
    
    /** Title of this schema */
    var title: js.UndefOr[String] = js.native
  }
  
  /* Inlined @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<@sinclair/typebox.@sinclair/typebox.TSchema> */
  @js.native
  trait TReadonlyOptionalTSchema
    extends StObject
       with /* prop */ StringDictionary[Any]
       with TModifier {
    
    /** Default value for this schema */
    var default: js.UndefOr[Any] = js.native
    
    /** Id for this schema */
    @JSName("$id")
    var $id: js.UndefOr[String] = js.native
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    /** Description of this schema */
    var description: js.UndefOr[String] = js.native
    
    /** Example values matching this schema */
    var examples: js.UndefOr[Any] = js.native
    
    var params: js.Array[Any] = js.native
    
    var static: Any = js.native
    
    /** Title of this schema */
    var title: js.UndefOr[String] = js.native
  }
  
  /* Inlined @sinclair/typebox.@sinclair/typebox.TReadonly<@sinclair/typebox.@sinclair/typebox.TSchema> */
  @js.native
  trait TReadonlyTSchema
    extends StObject
       with /* prop */ StringDictionary[Any]
       with TModifier {
    
    /** Default value for this schema */
    var default: js.UndefOr[Any] = js.native
    
    /** Id for this schema */
    @JSName("$id")
    var $id: js.UndefOr[String] = js.native
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    /** Description of this schema */
    var description: js.UndefOr[String] = js.native
    
    /** Example values matching this schema */
    var examples: js.UndefOr[Any] = js.native
    
    var params: js.Array[Any] = js.native
    
    var static: Any = js.native
    
    /** Title of this schema */
    var title: js.UndefOr[String] = js.native
  }
  
  trait Type extends StObject {
    
    var path: TString
    
    var `type`: TLiteral[update]
    
    var value: TUnknown
  }
  object Type {
    
    inline def apply(path: TString, `type`: TLiteral[update], value: TUnknown): Type = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setPath(value: TString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: TLiteral[update]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TUnknown): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
