package typings.storybookStore

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ArgsMod {
  
  @JSImport("@storybook/store/dist/ts3.9/args", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/store/dist/ts3.9/args", "DEEPLY_EQUAL")
  @js.native
  val DEEPLY_EQUAL: js.Symbol = js.native
  
  @JSImport("@storybook/store/dist/ts3.9/args", "NO_TARGET_NAME")
  @js.native
  val NO_TARGET_NAME: /* "" */ String = js.native
  
  inline def combineArgs(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineArgs")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def deepDiff(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepDiff")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def groupArgsByTarget[TArgs](
    hasArgsArgTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<AnyFramework, TArgs> */ Any
  ): Record[String, Partial[TArgs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupArgsByTarget")(hasArgsArgTypes.asInstanceOf[js.Any]).asInstanceOf[Record[String, Partial[TArgs]]]
  
  inline def mapArgsToTypes(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapArgsToTypes")(args.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def noTargetArgs[TArgs](
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<AnyFramework, TArgs> */ Any
  ): Partial[TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("noTargetArgs")(context.asInstanceOf[js.Any]).asInstanceOf[Partial[TArgs]]
  
  inline def validateOptions(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(args.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any])).asInstanceOf[Any]
}
