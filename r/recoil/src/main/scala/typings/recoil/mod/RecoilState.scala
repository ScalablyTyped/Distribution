package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "RecoilState")
@js.native
class RecoilState[T] ()
  extends AbstractRecoilValue[T]
     with RecoilValue[T]
