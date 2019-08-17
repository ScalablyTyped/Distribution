package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldMod {
  import typings.react.reactMod.InputHTMLAttributes
  import typings.react.reactMod.SelectHTMLAttributes
  import typings.react.reactMod.TextareaHTMLAttributes
  import typings.std.HTMLInputElement
  import typings.std.HTMLSelectElement
  import typings.std.HTMLTextAreaElement

  type EventHandler[Event] = js.Function2[/* event */ Event, /* name */ js.UndefOr[String], Unit]
  type EventWithDataHandler[Event] = js.Function4[
    /* event */ js.UndefOr[Event], 
    /* newValue */ js.UndefOr[js.Any], 
    /* previousValue */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[String], 
    Unit
  ]
  type Formatter = js.Function2[/* value */ js.Any, /* name */ String, js.Any]
  type GenericFieldHTMLAttributes = InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement]
  type Normalizer = js.Function4[
    /* value */ js.Any, 
    /* previousValue */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    /* previousAllValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Parser = js.Function2[/* value */ js.Any, /* name */ String, js.Any]
  type Validator = js.Function4[
    /* value */ js.Any, 
    /* allValues */ js.UndefOr[js.Any], 
    /* props */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[js.Any], 
    js.Any
  ]
}
