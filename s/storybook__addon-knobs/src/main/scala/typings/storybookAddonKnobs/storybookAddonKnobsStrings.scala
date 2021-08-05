package typings.storybookAddonKnobs

import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptionsDisplay
import typings.storybookAddonKnobs.typesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookAddonKnobsStrings {
  
  @js.native
  sealed trait Mutable extends StObject
  inline def Mutable: Mutable = "Mutable".asInstanceOf[Mutable]
  
  @js.native
  sealed trait array
    extends StObject
       with KnobType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait boolean
    extends StObject
       with KnobType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait button
    extends StObject
       with KnobType
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait check
    extends StObject
       with OptionsKnobOptionsDisplay
  inline def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait color
    extends StObject
       with KnobType
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait date
    extends StObject
       with KnobType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait files
    extends StObject
       with KnobType
  inline def files: files = "files".asInstanceOf[files]
  
  @js.native
  sealed trait `inline-check`
    extends StObject
       with OptionsKnobOptionsDisplay
  inline def `inline-check`: `inline-check` = "inline-check".asInstanceOf[`inline-check`]
  
  @js.native
  sealed trait `inline-radio`
    extends StObject
       with OptionsKnobOptionsDisplay
  inline def `inline-radio`: `inline-radio` = "inline-radio".asInstanceOf[`inline-radio`]
  
  @js.native
  sealed trait `multi-select`
    extends StObject
       with OptionsKnobOptionsDisplay
  inline def `multi-select`: `multi-select` = "multi-select".asInstanceOf[`multi-select`]
  
  @js.native
  sealed trait number
    extends StObject
       with KnobType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with KnobType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait options
    extends StObject
       with KnobType
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait radio
    extends StObject
       with OptionsKnobOptionsDisplay
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait radios
    extends StObject
       with KnobType
  inline def radios: radios = "radios".asInstanceOf[radios]
  
  @js.native
  sealed trait select
    extends StObject
       with KnobType
       with OptionsKnobOptionsDisplay
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait text
    extends StObject
       with KnobType
  inline def text: text = "text".asInstanceOf[text]
}
