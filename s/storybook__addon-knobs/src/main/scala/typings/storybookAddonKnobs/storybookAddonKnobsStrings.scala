package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonKnobsStrings {
  @js.native
  sealed trait Mutable extends js.Object
  
  @js.native
  sealed trait array extends KnobType
  
  @js.native
  sealed trait boolean extends KnobType
  
  @js.native
  sealed trait button extends KnobType
  
  @js.native
  sealed trait check extends OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait color extends KnobType
  
  @js.native
  sealed trait date extends KnobType
  
  @js.native
  sealed trait files extends KnobType
  
  @js.native
  sealed trait `inline-check` extends OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait `inline-radio` extends OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait `multi-select` extends OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait number extends KnobType
  
  @js.native
  sealed trait `object` extends KnobType
  
  @js.native
  sealed trait options extends KnobType
  
  @js.native
  sealed trait radio extends OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait radios extends KnobType
  
  @js.native
  sealed trait select
    extends KnobType
       with OptionsKnobOptionsDisplay
  
  @js.native
  sealed trait text extends KnobType
  
  @scala.inline
  def Mutable: Mutable = "Mutable".asInstanceOf[Mutable]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def files: files = "files".asInstanceOf[files]
  @scala.inline
  def `inline-check`: `inline-check` = "inline-check".asInstanceOf[`inline-check`]
  @scala.inline
  def `inline-radio`: `inline-radio` = "inline-radio".asInstanceOf[`inline-radio`]
  @scala.inline
  def `multi-select`: `multi-select` = "multi-select".asInstanceOf[`multi-select`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def radios: radios = "radios".asInstanceOf[radios]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

