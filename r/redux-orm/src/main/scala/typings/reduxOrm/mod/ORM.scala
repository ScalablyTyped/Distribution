package typings.reduxOrm.mod

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.ORMOpts
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "ORM")
@js.native
/**
  * Creates a new ORM instance.
  */
class ORM[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, ModelNames /* <: /* keyof I */ String */] ()
  extends typings.reduxOrm.ormMod.ORM[I, ModelNames] {
  def this(opts: ORMOpts) = this()
}

