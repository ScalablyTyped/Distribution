package typings.reduxLogger.mod

import typings.reduxLogger.reduxLoggerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReduxLoggerOptions extends js.Object {
  
  var actionTransformer: js.UndefOr[js.Function1[/* action */ js.Any, _]] = js.native
  
  var collapsed: js.UndefOr[Boolean | LoggerPredicate] = js.native
  
  var colors: js.UndefOr[ColorsObject | `false`] = js.native
  
  var diff: js.UndefOr[Boolean] = js.native
  
  var diffPredicate: js.UndefOr[LoggerPredicate] = js.native
  
  var duration: js.UndefOr[Boolean] = js.native
  
  var errorTransformer: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  
  var level: js.UndefOr[String | ActionToString | LevelObject] = js.native
  
  var logErrors: js.UndefOr[Boolean] = js.native
  
  var logger: js.UndefOr[js.Any] = js.native
  
  var predicate: js.UndefOr[LoggerPredicate] = js.native
  
  var stateTransformer: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  
  var timestamp: js.UndefOr[Boolean] = js.native
  
  var titleFormatter: js.UndefOr[
    js.Function3[/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double, String]
  ] = js.native
}
object ReduxLoggerOptions {
  
  @scala.inline
  def apply(): ReduxLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxLoggerOptions]
  }
  
  @scala.inline
  implicit class ReduxLoggerOptionsOps[Self <: ReduxLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setActionTransformer(value: /* action */ js.Any => _): Self = this.set("actionTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionTransformer: Self = this.set("actionTransformer", js.undefined)
    
    @scala.inline
    def setCollapsedFunction3(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = this.set("collapsed", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCollapsed(value: Boolean | LoggerPredicate): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setColors(value: ColorsObject | `false`): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDiff(value: Boolean): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setDiffPredicate(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = this.set("diffPredicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDiffPredicate: Self = this.set("diffPredicate", js.undefined)
    
    @scala.inline
    def setDuration(value: Boolean): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setErrorTransformer(value: /* error */ js.Any => _): Self = this.set("errorTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorTransformer: Self = this.set("errorTransformer", js.undefined)
    
    @scala.inline
    def setLevelFunction1(value: /* action */ js.Any => String): Self = this.set("level", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: String | ActionToString | LevelObject): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLogErrors(value: Boolean): Self = this.set("logErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogErrors: Self = this.set("logErrors", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPredicate(
      value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
    ): Self = this.set("predicate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePredicate: Self = this.set("predicate", js.undefined)
    
    @scala.inline
    def setStateTransformer(value: /* state */ js.Any => _): Self = this.set("stateTransformer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateTransformer: Self = this.set("stateTransformer", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTitleFormatter(value: (/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double) => String): Self = this.set("titleFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTitleFormatter: Self = this.set("titleFormatter", js.undefined)
  }
}
