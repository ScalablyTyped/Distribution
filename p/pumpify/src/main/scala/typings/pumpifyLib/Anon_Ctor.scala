package typings
package pumpifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctor extends js.Object {
  def ctor(opts: pumpifyLib.pumpifyMod.PumpifyFactoryOptions): /* import warning: ImportType.apply Failed type conversion: typeof Pumpify */ js.Any
}

object Anon_Ctor {
  @scala.inline
  def apply(
    ctor: js.Function1[
      pumpifyLib.pumpifyMod.PumpifyFactoryOptions, 
      /* import warning: ImportType.apply Failed type conversion: typeof Pumpify */ js.Any
    ]
  ): Anon_Ctor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctor")(ctor)
    __obj.asInstanceOf[Anon_Ctor]
  }
}

