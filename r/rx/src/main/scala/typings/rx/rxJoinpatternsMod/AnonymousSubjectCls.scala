package typings.rx.rxJoinpatternsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.joinpatterns", "AnonymousSubject")
@js.native
/**
  * Creates a subject that can only receive one value and that value is cached for all future observations.
  * @constructor
  */
class AnonymousSubjectCls[T] ()
  extends typings.rx.Rx.Subject[T]
