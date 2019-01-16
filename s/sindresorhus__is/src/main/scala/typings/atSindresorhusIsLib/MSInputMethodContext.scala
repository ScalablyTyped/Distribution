package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSInputMethodContext extends EventTarget {
  val compositionEndOffset: scala.Double = js.native
  val compositionStartOffset: scala.Double = js.native
  var oncandidatewindowhide: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oncandidatewindowshow: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oncandidatewindowupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val target: HTMLElement = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def getCandidateWindowClientRect(): ClientRect = js.native
  def getCompositionAlternatives(): Array[java.lang.String] = js.native
  def hasComposition(): scala.Boolean = js.native
  def isCandidateWindowVisible(): scala.Boolean = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("MSInputMethodContext")
@js.native
object MSInputMethodContext
  extends org.scalablytyped.runtime.Instantiable0[MSInputMethodContext]

