package typings.rpio

import typings.rpio.rpioStrings.`raspi-2`
import typings.rpio.rpioStrings.`raspi-3`
import typings.rpio.rpioStrings.`raspi-aPlussign`
import typings.rpio.rpioStrings.`raspi-a`
import typings.rpio.rpioStrings.`raspi-b-r1`
import typings.rpio.rpioStrings.`raspi-bPlussign`
import typings.rpio.rpioStrings.`raspi-b`
import typings.rpio.rpioStrings.`raspi-zero-w`
import typings.rpio.rpioStrings.`raspi-zero`
import typings.rpio.rpioStrings.gpio
import typings.rpio.rpioStrings.physical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RPIO_ {
  
  type CallbackFunction = js.Function1[/* pin */ Double, Unit]
  
  trait Options extends StObject {
    
    /**
      * There are two device nodes for GPIO access. The default is /dev/gpiomem which, when configured with gpio group access, allows users in that group to read/write directly to that device. This removes the need to run as root, but is limited to GPIO functions.
      * For non-GPIO functions (i²c, PWM, SPI) the /dev/mem device is required for full access to the Broadcom peripheral address range and the program needs to be executed as the root user (e.g. via sudo). If you do not explicitly call .init() when using those functions, the library will do it for you with gpiomem: false.
      * You may also need to use gpiomem: false if you are running on an older Linux kernel which does not support the gpiomem module.
      * rpio will throw an exception if you try to use one of the non-GPIO functions after already opening with /dev/gpiomem, as well as checking to see if you have the necessary permissions.
      *
      * Valid options:
      * true: use /dev/gpiomem for non-root but GPIO-only access
      * false: use /dev/mem for full access but requires root
      */
    var gpiomem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * There are two naming schemes when referring to GPIO pins:
      * By their physical header location: Pins 1 to 26 (A/B) or Pins 1 to 40 (A+/B+)
      * Using the Broadcom hardware map: GPIO 0-25 (B rev1), GPIO 2-27 (A/B rev2, A+/B+)
      *
      * Confusingly however, the Broadcom GPIO map changes between revisions, so for example P3 maps to GPIO0 on Model B Revision 1 models, but maps to GPIO2 on all later models.
      * This means the only sane default mapping is the physical layout, so that the same code will work on all models regardless of the underlying GPIO mapping.
      * If you prefer to use the Broadcom GPIO scheme for whatever reason (e.g. to use the P5 header pins on the Raspberry Pi 1 revision 2.0 model which aren't currently mapped to the physical layout), you can set mapping to gpio to switch to the GPIOxx naming.
      *
      * Valid options:
      * gpio: use the Broadcom GPIOxx naming
      * physical: use the physical P01-P40 header layou
      */
    var mapping: js.UndefOr[gpio | physical] = js.undefined
    
    /**
      * Mock mode is a dry-run environment where everything except pin access is performed. This is useful for testing scripts, and can also be used on systems which do not support GPIO at all.
      * If rpio is executed on unsupported hardware it will automatically start up in mock mode, and a warn event is emitted. By default the warn event is handled by a simple logger to stdout, but this can be overridden by the user creating their own warn handler.
      * The user can also explicitly request mock mode, where the argument is the type of hardware they wish to emulate.
      */
    var mock: js.UndefOr[
        `raspi-b-r1` | `raspi-a` | `raspi-b` | `raspi-aPlussign` | `raspi-bPlussign` | `raspi-2` | `raspi-3` | `raspi-zero` | `raspi-zero-w`
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGpiomem(value: Boolean): Self = StObject.set(x, "gpiomem", value.asInstanceOf[js.Any])
      
      inline def setGpiomemUndefined: Self = StObject.set(x, "gpiomem", js.undefined)
      
      inline def setMapping(value: gpio | physical): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
      
      inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
      
      inline def setMock(
        value: `raspi-b-r1` | `raspi-a` | `raspi-b` | `raspi-aPlussign` | `raspi-bPlussign` | `raspi-2` | `raspi-3` | `raspi-zero` | `raspi-zero-w`
      ): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
    }
  }
}
