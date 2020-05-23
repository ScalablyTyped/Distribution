package typings.rcRate.rateMod

import typings.rcRate.anon.AllowClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-rate/lib/Rate", JSImport.Default)
@js.native
class default protected () extends Rate {
  def this(props: RateProps) = this()
}

/* static members */
@JSImport("rc-rate/lib/Rate", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: AllowClear = js.native
  def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = js.native
}

