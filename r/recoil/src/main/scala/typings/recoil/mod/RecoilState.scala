package typings.recoil.mod

import typings.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "RecoilState")
@js.native
open class RecoilState[T] ()
  extends StObject
     with AbstractRecoilValue[T]
     with RecoilValue[T] {
  
  /* CompleteClass */
  override def __cTag(t: T): Unit = js.native
  
  /* CompleteClass */
  var __tag: js.Array[T] = js.native
  
  // for contravariance
  /* CompleteClass */
  var key: NodeKey = js.native
  
  /* CompleteClass */
  override def toJSON(): Key = js.native
}
