package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// class ClientResult {
//    get_value(): any;
//    setValue(value: any): void;
//    constructor();
// }
@JSGlobal("SP.ClientResult")
@js.native
open class ClientResult[T] ()
  extends StObject
     with typings.sharepoint.SP.ClientResult[T] {
  
  /* CompleteClass */
  override def get_value(): T = js.native
  
  /* CompleteClass */
  override def setValue(value: T): Unit = js.native
}
