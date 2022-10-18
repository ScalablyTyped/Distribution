package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9InitialStateMod {
  
  @JSImport("@storybook/api/dist/ts3.9/initial-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additions because its type Additions is not an array type */ additions: Additions
  ): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(additions.asInstanceOf[js.Any]).asInstanceOf[State]
  
  type Addition = StringDictionary[Any]
  
  type Additions = js.Array[Addition]
}
