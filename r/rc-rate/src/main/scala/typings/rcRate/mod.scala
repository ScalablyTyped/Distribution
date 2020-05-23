package typings.rcRate

import typings.rcRate.anon.AllowClear
import typings.rcRate.rateMod.RateProps
import typings.rcRate.rateMod.RateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-rate/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rcRate.rateMod.default {
    def this(props: RateProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AllowClear = js.native
    def getDerivedStateFromProps(nextProps: RateProps, state: RateState): RateState = js.native
  }
  
}

