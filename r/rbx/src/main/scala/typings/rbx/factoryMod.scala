package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.ClassName
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.rbxStrings.className
import typings.rbx.typesMod.UnionToIntersection
import typings.rbx.variablesMod.VariablesDefinitions
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("rbx/base/helpers/factory", "makePropTypesFactory")
  @js.native
  val makePropTypesFactory: MakePropTypesFactoryFunction = js.native
  
  @JSImport("rbx/base/helpers/factory", "makeRootValidatingTransformFactory")
  @js.native
  def makeRootValidatingTransformFactory[T /* <: js.Array[MakeValidatingTransformFunction[_, _]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param mvtfs because its type T is not an array type */ mvtfs: T
  ): js.Function1[
    /* variables */ PartialVariablesDefinitio, 
    js.Function3[
      /* props */ ClassName with (UnionToIntersection[
        ExtractTTransformProps[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ]), 
      /* componentName */ String, 
      /* location */ js.UndefOr[String], 
      (Pick[
        ClassName with (UnionToIntersection[
          ExtractTTransformProps[
            /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
          ]
        ]), 
        Exclude[
          className, 
          /* keyof rbx.rbx/types.UnionToIntersection<rbx.rbx/base/helpers/factory.ExtractTTransformProps<T[number]>> */ String
        ]
      ]) with ClassName with (UnionToIntersection[
        ExtractTNewProps[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ])
    ]
  ] = js.native
  
  @JSImport("rbx/base/helpers/factory", "makeValidatingTransformFactory")
  @js.native
  def makeValidatingTransformFactory[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */](
    makePropTypesFunc: MakePropTypesFunction,
    transformFunc: TransformFunction[TTransformProps, TNewProps]
  ): MakeValidatingTransformFunction[TTransformProps, TNewProps] = js.native
  
  type ExtractTNewProps[T /* <: MakeValidatingTransformFunction[_, _] */] = js.Any
  
  type ExtractTTransformProps[T /* <: MakeValidatingTransformFunction[_, _] */] = js.Any
  
  type MakePropTypesFactoryFunction = js.Function1[
    /* makePropTypes */ js.Function1[/* variables */ VariablesDefinitions, ValidationMap[js.Any]], 
    MakePropTypesFunction
  ]
  
  type MakePropTypesFunction = js.Function1[/* variables */ js.UndefOr[PartialVariablesDefinitio], ValidationMap[js.Any]]
  
  type MakeValidatingTransformFunction[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] = js.Function1[
    /* variables */ js.UndefOr[VariablesDefinitions], 
    js.Function3[
      /* props */ ClassName with Partial[TTransformProps], 
      /* componentName */ String, 
      /* location */ js.UndefOr[String], 
      ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ]
  ]
  
  type TransformFunction[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] = js.Function1[
    /* props */ ClassName with Partial[TTransformProps], 
    (Omit[
      ClassName with Partial[TTransformProps], 
      (/* keyof TTransformProps */ String) | className
    ]) with ClassName with TNewProps
  ]
  
  type ValidatingTransformFunction[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] = js.Function3[
    /* props */ ClassName with Partial[TTransformProps], 
    /* componentName */ String, 
    /* location */ js.UndefOr[String], 
    ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ]
}
