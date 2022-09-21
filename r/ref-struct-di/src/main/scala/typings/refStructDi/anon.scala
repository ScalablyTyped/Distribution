package typings.refStructDi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.refNapi.mod.TypeLike
import typings.refStructDi.mod.StructType
import typings.refStructDi.mod.StructTypeObjectDefinitionBase
import typings.refStructDi.mod.StructTypeObjectDefinitionInferenceMarker
import typings.refStructDi.mod.StructTypeObjectDefinitionToStructTypeDefinition
import typings.refStructDi.mod.StructTypeTupleDefinitionBase
import typings.refStructDi.mod.StructTypeTupleDefinitionInferenceMarker
import typings.refStructDi.mod.StructTypeTupleDefinitionToStructTypeDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call
    extends StObject
       with /**
    * Creates a new {@link struct.StructType} for the provided field definitions.
    */
  Instantiable0[StructType[Any]]
       with /**
    * Creates a new {@link struct.StructType} for the provided field definitions.
    */
  Instantiable1[
          (/* fields */ js.Array[js.Tuple2[TypeLike, String]]) | (/* fields */ Record[String, TypeLike]) | StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker | StructTypeTupleDefinitionBase | StructTypeTupleDefinitionInferenceMarker, 
          StructType[
            Any | (StructTypeObjectDefinitionToStructTypeDefinition[StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker]) | (StructTypeTupleDefinitionToStructTypeDefinition[StructTypeTupleDefinitionBase | StructTypeTupleDefinitionInferenceMarker])
          ]
        ]
       with Instantiable2[
          (/* fields */ js.Array[js.Tuple2[TypeLike, String]]) | (/* fields */ Record[String, TypeLike]) | StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker | StructTypeTupleDefinitionBase | StructTypeTupleDefinitionInferenceMarker | (/* fields */ Unit), 
          /* opt */ Packed, 
          StructType[
            Any | (StructTypeObjectDefinitionToStructTypeDefinition[StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker]) | (StructTypeTupleDefinitionToStructTypeDefinition[StructTypeTupleDefinitionBase | StructTypeTupleDefinitionInferenceMarker])
          ]
        ] {
    
    /**
      * Creates a new {@link struct.StructType} for the provided field definitions.
      */
    def apply(): StructType[Any] = js.native
    def apply(fields: js.Array[js.Tuple2[TypeLike, String]]): StructType[Any] = js.native
    def apply(fields: js.Array[js.Tuple2[TypeLike, String]], opt: Packed): StructType[Any] = js.native
    def apply(fields: Unit, opt: Packed): StructType[Any] = js.native
    def apply(fields: Record[String, TypeLike]): StructType[Any] = js.native
    def apply(fields: Record[String, TypeLike], opt: Packed): StructType[Any] = js.native
    /**
      * Creates a new {@link struct.StructType} for the provided field definitions.
      */
    def apply[TDefinition /* <: StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker */](fields: TDefinition): StructType[StructTypeObjectDefinitionToStructTypeDefinition[TDefinition]] = js.native
    def apply[TDefinition /* <: StructTypeObjectDefinitionBase | StructTypeObjectDefinitionInferenceMarker */](fields: TDefinition, opt: Packed): StructType[StructTypeObjectDefinitionToStructTypeDefinition[TDefinition]] = js.native
  }
  
  trait Packed extends StObject {
    
    var packed: js.UndefOr[Boolean] = js.undefined
  }
  object Packed {
    
    inline def apply(): Packed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Packed]
    }
    
    extension [Self <: Packed](x: Self) {
      
      inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    }
  }
}
