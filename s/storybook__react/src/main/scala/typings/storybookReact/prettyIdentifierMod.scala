package typings.storybookReact

import typings.storybookReact.typesMod.InspectionIdentifiableInferedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prettyIdentifierMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/defaultValues/prettyIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrettyElementIdentifier(identifier: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyElementIdentifier")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPrettyFuncIdentifier(identifier: String, hasArguments: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyFuncIdentifier")(identifier.asInstanceOf[js.Any], hasArguments.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPrettyIdentifier(inferredType: InspectionIdentifiableInferedType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrettyIdentifier")(inferredType.asInstanceOf[js.Any]).asInstanceOf[String]
}
