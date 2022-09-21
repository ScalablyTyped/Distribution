package typings.recoil.mod

import typings.recoil.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "RecoilValueReadOnly")
@js.native
open class RecoilValueReadOnly[T] ()
  extends StObject
     with AbstractRecoilValueReadonly[T]
     with RecoilValue[T] {
  
  /* CompleteClass */
  var __tag: js.Array[T] = js.native
  
  /* CompleteClass */
  var key: NodeKey = js.native
  
  /* CompleteClass */
  override def toJSON(): Key = js.native
}
