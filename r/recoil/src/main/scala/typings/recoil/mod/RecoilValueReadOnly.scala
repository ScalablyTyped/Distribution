package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "RecoilValueReadOnly")
@js.native
class RecoilValueReadOnly[T] ()
  extends AbstractRecoilValueReadonly[T]
     with RecoilValue[T]
