package typings.rtpParser.mod

import typings.rtpParser.rtpParserNumbers.`11025`
import typings.rtpParser.rtpParserNumbers.`16000`
import typings.rtpParser.rtpParserNumbers.`1`
import typings.rtpParser.rtpParserNumbers.`22050`
import typings.rtpParser.rtpParserNumbers.`2`
import typings.rtpParser.rtpParserNumbers.`44100`
import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.AV
import typings.rtpParser.rtpParserStrings.CN
import typings.rtpParser.rtpParserStrings.CelB
import typings.rtpParser.rtpParserStrings.DVI4
import typings.rtpParser.rtpParserStrings.G722
import typings.rtpParser.rtpParserStrings.G723
import typings.rtpParser.rtpParserStrings.G728
import typings.rtpParser.rtpParserStrings.G729
import typings.rtpParser.rtpParserStrings.GSM
import typings.rtpParser.rtpParserStrings.H261
import typings.rtpParser.rtpParserStrings.H263
import typings.rtpParser.rtpParserStrings.JPEG
import typings.rtpParser.rtpParserStrings.L16
import typings.rtpParser.rtpParserStrings.LPC
import typings.rtpParser.rtpParserStrings.MP2T
import typings.rtpParser.rtpParserStrings.MPA
import typings.rtpParser.rtpParserStrings.MPV
import typings.rtpParser.rtpParserStrings.PCMA
import typings.rtpParser.rtpParserStrings.PCMU
import typings.rtpParser.rtpParserStrings.QCELP
import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.dynamic
import typings.rtpParser.rtpParserStrings.nv
import typings.rtpParser.rtpParserStrings.reserved
import typings.rtpParser.rtpParserStrings.unassigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedRTPType extends js.Object {
  var channels: js.UndefOr[`1` | `2`] = js.native
  var clockRate: js.UndefOr[`8000` | `16000` | `44100` | `90000` | `11025` | `22050`] = js.native
  var mediaType: js.UndefOr[A | AV | V] = js.native
  var name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic = js.native
}

object ParsedRTPType {
  @scala.inline
  def apply(
    name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
  ): ParsedRTPType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedRTPType]
  }
  @scala.inline
  implicit class ParsedRTPTypeOps[Self <: ParsedRTPType] (val x: Self) extends AnyVal {
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
    def setName(
      value: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: `1` | `2`): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setClockRate(value: `8000` | `16000` | `44100` | `90000` | `11025` | `22050`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockRate: Self = this.set("clockRate", js.undefined)
    @scala.inline
    def setMediaType(value: A | AV | V): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
  
}

