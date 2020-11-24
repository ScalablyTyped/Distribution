package typings.segmentAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnonymousId extends js.Object {
  
  def anonymousId(): String = js.native
  def anonymousId(newId: String): String = js.native
  
  def id(): js.UndefOr[String | Null] = js.native
  def id(newId: String): js.UndefOr[String | Null] = js.native
  
  def logout(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def traits(): Unit = js.native
  def traits(newTraits: js.Object): Unit = js.native
}
