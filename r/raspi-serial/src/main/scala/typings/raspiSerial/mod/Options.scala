package typings.raspiSerial.mod

import typings.raspiSerial.raspiSerialNumbers.`110`
import typings.raspiSerial.raspiSerialNumbers.`115200`
import typings.raspiSerial.raspiSerialNumbers.`1200`
import typings.raspiSerial.raspiSerialNumbers.`134`
import typings.raspiSerial.raspiSerialNumbers.`150`
import typings.raspiSerial.raspiSerialNumbers.`1800`
import typings.raspiSerial.raspiSerialNumbers.`19200`
import typings.raspiSerial.raspiSerialNumbers.`1`
import typings.raspiSerial.raspiSerialNumbers.`200`
import typings.raspiSerial.raspiSerialNumbers.`2400`
import typings.raspiSerial.raspiSerialNumbers.`2`
import typings.raspiSerial.raspiSerialNumbers.`300`
import typings.raspiSerial.raspiSerialNumbers.`38400`
import typings.raspiSerial.raspiSerialNumbers.`4800`
import typings.raspiSerial.raspiSerialNumbers.`50`
import typings.raspiSerial.raspiSerialNumbers.`57600`
import typings.raspiSerial.raspiSerialNumbers.`5`
import typings.raspiSerial.raspiSerialNumbers.`600`
import typings.raspiSerial.raspiSerialNumbers.`6`
import typings.raspiSerial.raspiSerialNumbers.`75`
import typings.raspiSerial.raspiSerialNumbers.`7`
import typings.raspiSerial.raspiSerialNumbers.`8`
import typings.raspiSerial.raspiSerialNumbers.`9600`
import typings.raspiSerial.raspiSerialStrings.even
import typings.raspiSerial.raspiSerialStrings.mark
import typings.raspiSerial.raspiSerialStrings.none
import typings.raspiSerial.raspiSerialStrings.odd
import typings.raspiSerial.raspiSerialStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.native
  
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
  
  var parity: js.UndefOr[none | even | mark | odd | space] = js.native
  
  var portId: js.UndefOr[String] = js.native
  
  var stopBits: js.UndefOr[`1` | `2`] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaudRate(
      value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
    ): Self = this.set("baudRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaudRate: Self = this.set("baudRate", js.undefined)
    
    @scala.inline
    def setDataBits(value: `8` | `7` | `6` | `5`): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    
    @scala.inline
    def setParity(value: none | even | mark | odd | space): Self = this.set("parity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParity: Self = this.set("parity", js.undefined)
    
    @scala.inline
    def setPortId(value: String): Self = this.set("portId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortId: Self = this.set("portId", js.undefined)
    
    @scala.inline
    def setStopBits(value: `1` | `2`): Self = this.set("stopBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopBits: Self = this.set("stopBits", js.undefined)
  }
}
