package typings.rScript.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rScript.rScriptStrings.ISO8601
import typings.rScript.rScriptStrings.`null`
import typings.rScript.rScriptStrings.base64
import typings.rScript.rScriptStrings.columnmajor
import typings.rScript.rScriptStrings.colums
import typings.rScript.rScriptStrings.epoch
import typings.rScript.rScriptStrings.hex
import typings.rScript.rScriptStrings.integer
import typings.rScript.rScriptStrings.list
import typings.rScript.rScriptStrings.mongo
import typings.rScript.rScriptStrings.rowmajor
import typings.rScript.rScriptStrings.rows
import typings.rScript.rScriptStrings.string
import typings.rScript.rScriptStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* key */ StringDictionary[js.Any] {
  var Date: js.UndefOr[ISO8601 | epoch] = js.native
  var POSIXt: js.UndefOr[string | ISO8601 | epoch | mongo] = js.native
  var auto_unbox: js.UndefOr[Boolean] = js.native
  var complex: js.UndefOr[string | list] = js.native
  var dataframe: js.UndefOr[rows | colums | values] = js.native
  var digits: js.UndefOr[Double] = js.native
  var factor: js.UndefOr[string | integer] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var matrix: js.UndefOr[rowmajor | columnmajor] = js.native
  var na: js.UndefOr[`null` | string] = js.native
  var `null`: js.UndefOr[list | typings.rScript.rScriptStrings.`null`] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var raw: js.UndefOr[base64 | hex | mongo] = js.native
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
    def setDate(value: ISO8601 | epoch): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    @scala.inline
    def setPOSIXt(value: string | ISO8601 | epoch | mongo): Self = this.set("POSIXt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePOSIXt: Self = this.set("POSIXt", js.undefined)
    @scala.inline
    def setAuto_unbox(value: Boolean): Self = this.set("auto_unbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto_unbox: Self = this.set("auto_unbox", js.undefined)
    @scala.inline
    def setComplex(value: string | list): Self = this.set("complex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplex: Self = this.set("complex", js.undefined)
    @scala.inline
    def setDataframe(value: rows | colums | values): Self = this.set("dataframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataframe: Self = this.set("dataframe", js.undefined)
    @scala.inline
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setFactor(value: string | integer): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFactor: Self = this.set("factor", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setMatrix(value: rowmajor | columnmajor): Self = this.set("matrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    @scala.inline
    def setNa(value: `null` | string): Self = this.set("na", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNa: Self = this.set("na", js.undefined)
    @scala.inline
    def setNull(value: list | `null`): Self = this.set("null", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNull: Self = this.set("null", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setRaw(value: base64 | hex | mongo): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

