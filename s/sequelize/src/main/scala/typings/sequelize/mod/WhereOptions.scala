package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : sequelize.sequelize.WhereOptions<T[P]> | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
  }}}
  */
@js.native
trait WhereOptions[T] extends StObject
