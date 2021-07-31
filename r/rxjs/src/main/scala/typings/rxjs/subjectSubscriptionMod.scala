package typings.rxjs

import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subjectSubscriptionMod {
  
  @JSImport("rxjs/internal/SubjectSubscription", "SubjectSubscription")
  @js.native
  class SubjectSubscription[T] protected () extends Subscription {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
    
    var subject: Subject[T] = js.native
    
    var subscriber: Observer[T] = js.native
  }
}
