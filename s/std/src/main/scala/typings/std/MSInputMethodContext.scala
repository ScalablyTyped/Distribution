package typings.std

import typings.std.stdStrings.MSCandidateWindowHide
import typings.std.stdStrings.MSCandidateWindowShow
import typings.std.stdStrings.MSCandidateWindowUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSInputMethodContext
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val compositionEndOffset: Double = js.native
  
  val compositionStartOffset: Double = js.native
  
  def getCandidateWindowClientRect(): ClientRect = js.native
  
  def getCompositionAlternatives(): js.Array[java.lang.String] = js.native
  
  def hasComposition(): scala.Boolean = js.native
  
  def isCandidateWindowVisible(): scala.Boolean = js.native
  
  var oncandidatewindowhide: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var oncandidatewindowshow: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var oncandidatewindowupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowHide(
    `type`: MSCandidateWindowHide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowShow(
    `type`: MSCandidateWindowShow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSCandidateWindowUpdate(
    `type`: MSCandidateWindowUpdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val target: HTMLElement = js.native
}
