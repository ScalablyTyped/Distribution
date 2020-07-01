package typings.sqlite.interfacesMod.ISqlite

import typings.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunResult[Stmt /* <: Statement */] extends js.Object {
  /**
    * Number of rows changed.
    *
    * Only contains valid information when the query was a
    * successfully completed UPDATE or DELETE statement.
    */
  var changes: js.UndefOr[Double] = js.undefined
  /**
    * Row id of the inserted row.
    *
    * Only contains valid information when the query was a successfully
    * completed INSERT statement.
    */
  var lastID: js.UndefOr[Double] = js.undefined
  /**
    * Statement object.
    *
    * It is not possible to run the statement again because it is
    * automatically finalized after running for the first time.
    * Any subsequent attempts to run the statement again will fail.
    */
  var stmt: typings.sqlite.statementMod.Statement[Stmt]
}

object RunResult {
  @scala.inline
  def apply[/* <: typings.sqlite.sqlite3Mod.Statement */ Stmt](
    stmt: typings.sqlite.statementMod.Statement[Stmt],
    changes: js.UndefOr[Double] = js.undefined,
    lastID: js.UndefOr[Double] = js.undefined
  ): RunResult[Stmt] = {
    val __obj = js.Dynamic.literal(stmt = stmt.asInstanceOf[js.Any])
    if (!js.isUndefined(changes)) __obj.updateDynamic("changes")(changes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastID)) __obj.updateDynamic("lastID")(lastID.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult[Stmt]]
  }
}

