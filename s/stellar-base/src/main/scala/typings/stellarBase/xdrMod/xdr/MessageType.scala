package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`10`
import typings.stellarBase.stellarBaseNumbers.`11`
import typings.stellarBase.stellarBaseNumbers.`12`
import typings.stellarBase.stellarBaseNumbers.`13`
import typings.stellarBase.stellarBaseNumbers.`14`
import typings.stellarBase.stellarBaseNumbers.`15`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseNumbers.`5`
import typings.stellarBase.stellarBaseNumbers.`6`
import typings.stellarBase.stellarBaseNumbers.`7`
import typings.stellarBase.stellarBaseNumbers.`8`
import typings.stellarBase.stellarBaseNumbers.`9`
import typings.stellarBase.stellarBaseStrings.auth
import typings.stellarBase.stellarBaseStrings.dontHave
import typings.stellarBase.stellarBaseStrings.errorMsg
import typings.stellarBase.stellarBaseStrings.getPeers
import typings.stellarBase.stellarBaseStrings.getScpQuorumset
import typings.stellarBase.stellarBaseStrings.getScpState
import typings.stellarBase.stellarBaseStrings.getTxSet
import typings.stellarBase.stellarBaseStrings.hello
import typings.stellarBase.stellarBaseStrings.peers
import typings.stellarBase.stellarBaseStrings.scpMessage
import typings.stellarBase.stellarBaseStrings.scpQuorumset
import typings.stellarBase.stellarBaseStrings.surveyRequest
import typings.stellarBase.stellarBaseStrings.surveyResponse
import typings.stellarBase.stellarBaseStrings.transaction
import typings.stellarBase.stellarBaseStrings.txSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageType extends StObject {
  
  val name: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse = js.native
  
  val value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
}
object MessageType {
  
  @scala.inline
  def apply(
    name: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse,
    value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): MessageType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageType]
  }
  
  @scala.inline
  implicit class MessageTypeMutableBuilder[Self <: MessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: errorMsg | auth | dontHave | getPeers | peers | getTxSet | txSet | transaction | getScpQuorumset | scpQuorumset | scpMessage | getScpState | hello | surveyRequest | surveyResponse
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: `0` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
