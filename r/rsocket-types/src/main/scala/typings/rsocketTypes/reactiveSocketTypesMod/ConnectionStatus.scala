package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesStrings.CLOSED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTED
import typings.rsocketTypes.rsocketTypesStrings.CONNECTING
import typings.rsocketTypes.rsocketTypesStrings.ERROR
import typings.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rsocketTypes.anon.Kind
  - typings.rsocketTypes.anon.`0`
  - typings.rsocketTypes.anon.`1`
  - typings.rsocketTypes.anon.`2`
  - typings.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  @scala.inline
  def `0`(kind: CONNECTING): typings.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.anon.`0`]
  }
  
  @scala.inline
  def `1`(kind: CONNECTED): typings.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.anon.`1`]
  }
  
  @scala.inline
  def `2`(kind: CLOSED): typings.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.anon.`2`]
  }
  
  @scala.inline
  def Error(error: typings.std.Error, kind: ERROR): typings.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.anon.Error]
  }
  
  @scala.inline
  def Kind(kind: NOT_CONNECTED): typings.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rsocketTypes.anon.Kind]
  }
}
