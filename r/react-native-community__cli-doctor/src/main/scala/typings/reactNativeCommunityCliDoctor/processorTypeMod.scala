package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.AMD
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorStrings.Intel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorTypeMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/windows/processorType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProcessorType(): Intel | AMD = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcessorType")().asInstanceOf[Intel | AMD]
}
