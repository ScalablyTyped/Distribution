package typings.storybookStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9FilterArgTypesMod {
  
  @JSImport("@storybook/store/dist/ts3.9/filterArgTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: Unit,
    exclude: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: PropDescriptor,
    exclude: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type PropDescriptor = js.Array[String] | js.RegExp
}
