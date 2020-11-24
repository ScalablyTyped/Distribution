package typings.sequelizeFixtures.mod.SequelizeFixtures

import typings.sequelize.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var encoding: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  var modifyFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var transaction: js.UndefOr[Transaction] = js.native
  
  var transformFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setLog(value: /* message */ String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setModifyFixtureDataFn(value: /* data */ js.Any => _): Self = this.set("modifyFixtureDataFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteModifyFixtureDataFn: Self = this.set("modifyFixtureDataFn", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setTransformFixtureDataFn(value: /* data */ js.Any => _): Self = this.set("transformFixtureDataFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransformFixtureDataFn: Self = this.set("transformFixtureDataFn", js.undefined)
  }
}
