package typings.prettyMs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Display time using colon notation: `5h 1m 45s` → `5:01:45`. Always shows time in at least minutes: `1s` → `0:01`
  		Useful when you want to display time without the time units, similar to a digital watch.
  		Setting `colonNotation` to `true` overrides the following options to `false`:
  		- `compact`
  		- `formatSubMilliseconds`
  		- `separateMilliseconds`
  		- `verbose`
  		@default false
  		*/
  val colonNotation: js.UndefOr[Boolean] = js.native
  
  /**
  		Only show the first unit: `1h 10m` → `1h`.
  		Also ensures that `millisecondsDecimalDigits` and `secondsDecimalDigits` are both set to `0`.
  		@default false
  		*/
  val compact: js.UndefOr[Boolean] = js.native
  
  /**
  		Show microseconds and nanoseconds.
  		@default false
  		*/
  val formatSubMilliseconds: js.UndefOr[Boolean] = js.native
  
  /**
  		Keep milliseconds on whole seconds: `13s` → `13.0s`.
  		Useful when you are showing a number of seconds spent on an operation and don't want the width of the output to change when hitting a whole number.
  		@default false
  		*/
  val keepDecimalsOnWholeSeconds: js.UndefOr[Boolean] = js.native
  
  /**
  		Number of digits to appear after the milliseconds decimal point.
  		Useful in combination with [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime).
  		@default 0
  		*/
  val millisecondsDecimalDigits: js.UndefOr[Double] = js.native
  
  /**
  		Number of digits to appear after the seconds decimal point.
  		@default 1
  		*/
  val secondsDecimalDigits: js.UndefOr[Double] = js.native
  
  /**
  		Show milliseconds separately. This means they won't be included in the decimal part of the seconds.
  		@default false
  		*/
  val separateMilliseconds: js.UndefOr[Boolean] = js.native
  
  /**
  		Number of units to show. Setting `compact` to `true` overrides this option.
  		@default Infinity
  		*/
  val unitCount: js.UndefOr[Double] = js.native
  
  /**
  		Use full-length units: `5h 1m 45s` → `5 hours 1 minute 45 seconds`.
  		@default false
  		*/
  val verbose: js.UndefOr[Boolean] = js.native
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
    def setColonNotation(value: Boolean): Self = this.set("colonNotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonNotation: Self = this.set("colonNotation", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setFormatSubMilliseconds(value: Boolean): Self = this.set("formatSubMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatSubMilliseconds: Self = this.set("formatSubMilliseconds", js.undefined)
    
    @scala.inline
    def setKeepDecimalsOnWholeSeconds(value: Boolean): Self = this.set("keepDecimalsOnWholeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepDecimalsOnWholeSeconds: Self = this.set("keepDecimalsOnWholeSeconds", js.undefined)
    
    @scala.inline
    def setMillisecondsDecimalDigits(value: Double): Self = this.set("millisecondsDecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecondsDecimalDigits: Self = this.set("millisecondsDecimalDigits", js.undefined)
    
    @scala.inline
    def setSecondsDecimalDigits(value: Double): Self = this.set("secondsDecimalDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondsDecimalDigits: Self = this.set("secondsDecimalDigits", js.undefined)
    
    @scala.inline
    def setSeparateMilliseconds(value: Boolean): Self = this.set("separateMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparateMilliseconds: Self = this.set("separateMilliseconds", js.undefined)
    
    @scala.inline
    def setUnitCount(value: Double): Self = this.set("unitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitCount: Self = this.set("unitCount", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
