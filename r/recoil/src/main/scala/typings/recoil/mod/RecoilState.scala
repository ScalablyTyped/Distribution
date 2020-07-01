package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "RecoilState")
@js.native
class RecoilState[T] ()
  extends AbstractRecoilValue[T]
     with RecoilValue[T]

