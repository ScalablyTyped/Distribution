package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.rbxStrings.className
import typings.rbx.typesMod.UnionToIntersection
import typings.rbx.variablesMod.VariablesDefinitions
import typings.std.Exclude
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/base/helpers/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  val makePropTypesFactory: MakePropTypesFactoryFunction = js.native
  def makeRootValidatingTransformFactory[T /* <: js.Array[MakeValidatingTransformFunction[_, _]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param mvtfs because its type T is not an array type */ mvtfs: T
  ): js.Function1[
    /* variables */ PartialVariablesDefinitio, 
    js.Function3[
      /* props */ AnonClassName with (UnionToIntersection[
        ExtractTTransformProps[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ]), 
      /* componentName */ String, 
      /* location */ js.UndefOr[String], 
      (Pick[
        AnonClassName with (UnionToIntersection[
          ExtractTTransformProps[
            /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
          ]
        ]), 
        Exclude[
          className, 
          /* keyof rbx.rbx/types.UnionToIntersection<rbx.rbx/base/helpers/factory.ExtractTTransformProps<T[number]>> */ String
        ]
      ]) with Anon2 with (UnionToIntersection[
        ExtractTNewProps[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ])
    ]
  ] = js.native
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
      /* props */ AnonClassName with Partial[TTransformProps], 
      /* componentName */ String, 
      /* location */ js.UndefOr[String], 
      ReturnType[TransformFunction[TTransformProps, TNewProps]]
    ]
  ]
  type TransformFunction[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] = js.Function1[
    /* props */ AnonClassName with Partial[TTransformProps], 
    (Omit[
      AnonClassName with Partial[TTransformProps], 
      (/* keyof TTransformProps */ String) | className
    ]) with Anon2 with TNewProps
  ]
  type ValidatingTransformFunction[TTransformProps /* <: js.Object */, TNewProps /* <: js.Object */] = js.Function3[
    /* props */ AnonClassName with Partial[TTransformProps], 
    /* componentName */ String, 
    /* location */ js.UndefOr[String], 
    ReturnType[TransformFunction[TTransformProps, TNewProps]]
  ]
}

