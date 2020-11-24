package typings.rx.rxCoincidenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.coincidence", "AsyncSubject")
@js.native
/**
  * Creates a subject that can only receive one value and that value is cached for all future observations.
  * @constructor
  */
class AsyncSubjectCls[T] ()
  extends typings.rx.Rx.Subject[T]
