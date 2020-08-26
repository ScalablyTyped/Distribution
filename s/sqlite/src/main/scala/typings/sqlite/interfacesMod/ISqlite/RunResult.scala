package typings.sqlite.interfacesMod.ISqlite

import typings.sqlite.sqlite3Mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunResult[Stmt /* <: Statement */] extends js.Object {
  /**
    * Number of rows changed.
    *
    * Only contains valid information when the query was a
    * successfully completed UPDATE or DELETE statement.
    */
  var changes: js.UndefOr[Double] = js.native
  /**
    * Row id of the inserted row.
    *
    * Only contains valid information when the query was a successfully
    * completed INSERT statement.
    */
  var lastID: js.UndefOr[Double] = js.native
  /**
    * Statement object.
    *
    * It is not possible to run the statement again because it is
    * automatically finalized after running for the first time.
    * Any subsequent attempts to run the statement again will fail.
    */
  var stmt: typings.sqlite.statementMod.Statement[Stmt] = js.native
}

object RunResult {
  @scala.inline
  def apply[/* <: typings.sqlite.sqlite3Mod.Statement */ Stmt](stmt: typings.sqlite.statementMod.Statement[Stmt]): RunResult[Stmt] = {
    val __obj = js.Dynamic.literal(stmt = stmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult[Stmt]]
  }
  @scala.inline
  implicit class RunResultOps[Self <: RunResult[_], /* <: typings.sqlite.sqlite3Mod.Statement */ Stmt] (val x: Self with RunResult[Stmt]) extends AnyVal {
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
    def setStmt(value: typings.sqlite.statementMod.Statement[Stmt]): Self = this.set("stmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setChanges(value: Double): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    @scala.inline
    def setLastID(value: Double): Self = this.set("lastID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastID: Self = this.set("lastID", js.undefined)
  }
  
}

