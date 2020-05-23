package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import typings.std.IIRFilterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IIRFilterNode")
@js.native
class IIRFilterNode protected ()
  extends typings.std.IIRFilterNode {
  def this(context: typings.std.BaseAudioContext, options: IIRFilterOptions) = this()
}

@JSGlobal("IIRFilterNode")
@js.native
object IIRFilterNode
  extends Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ IIRFilterOptions, 
      typings.std.IIRFilterNode
    ]

