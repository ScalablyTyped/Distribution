package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
@JSGlobal("SP.ClientResult")
@js.native
class ClientResult[T] () extends js.Object {
  def get_value(): T = js.native
  def setValue(value: T): scala.Unit = js.native
}

