package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialStateMod {
  
  @JSImport("@storybook/api/dist/initial-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additions because its type Additions is not an array type */ additions: Additions
  ): State = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(additions.asInstanceOf[js.Any]).asInstanceOf[State]
  
  type Addition = StringDictionary[js.Any]
  
  type Additions = js.Array[Addition]
}
