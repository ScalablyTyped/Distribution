package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true). */
@js.native
trait MediaQueryList extends EventTarget {
  val matches: scala.Boolean = js.native
  val media: java.lang.String = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addListener(): scala.Unit = js.native
  /** @deprecated */
  def addListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeListener(): scala.Unit = js.native
  /** @deprecated */
  def removeListener(listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, _]): scala.Unit = js.native
}

@JSGlobal("MediaQueryList")
@js.native
class MediaQueryListCls () extends MediaQueryList

@JSGlobal("MediaQueryList")
@js.native
object MediaQueryList
  extends org.scalablytyped.runtime.Instantiable0[MediaQueryList]

