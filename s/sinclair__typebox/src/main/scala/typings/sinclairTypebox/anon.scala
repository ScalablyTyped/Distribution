package typings.sinclairTypebox

import org.scalablytyped.runtime.StringDictionary
import typings.sinclairTypebox.mod.TModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var const: typings.sinclairTypebox.sinclairTypeboxInts.`1`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(const = 1)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setConst(value: typings.sinclairTypebox.sinclairTypeboxInts.`1`): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject
  
  @js.native
  trait `2` extends StObject
  
  trait Const extends StObject {
    
    var const: typings.sinclairTypebox.sinclairTypeboxInts.`0`
  }
  object Const {
    
    inline def apply(): Const = {
      val __obj = js.Dynamic.literal(const = 0)
      __obj.asInstanceOf[Const]
    }
    
    extension [Self <: Const](x: Self) {
      
      inline def setConst(value: typings.sinclairTypebox.sinclairTypeboxInts.`0`): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Modifier extends StObject
  
  trait Params[P /* <: js.Array[Any] */] extends StObject {
    
    var params: P
  }
  object Params {
    
    inline def apply[P /* <: js.Array[Any] */](params: P): Params[P] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params[P]]
    }
    
    extension [Self <: Params[?], P /* <: js.Array[Any] */](x: Self & Params[P]) {
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
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
    
    /** Example values matching this schema. */
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
    
    /** Example values matching this schema. */
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
    
    /** Example values matching this schema. */
    var examples: js.UndefOr[Any] = js.native
    
    var params: js.Array[Any] = js.native
    
    var static: Any = js.native
    
    /** Title of this schema */
    var title: js.UndefOr[String] = js.native
  }
}
