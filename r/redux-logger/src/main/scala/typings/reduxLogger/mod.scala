package typings.reduxLogger

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxLogger.reduxLoggerBooleans.`false`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-logger", JSImport.Default)
  @js.native
  val default: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-logger", "createLogger")
  @js.native
  def createLogger(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  @JSImport("redux-logger", "createLogger")
  @js.native
  def createLogger(options: ReduxLoggerOptions): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  
  @JSImport("redux-logger", "logger")
  @js.native
  val logger: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = js.native
  
  type ActionToString = js.Function1[/* action */ js.Any, String]
  
  @js.native
  trait ColorsObject extends StObject {
    
    var action: js.UndefOr[Boolean | ActionToString] = js.native
    
    var error: js.UndefOr[Boolean | ErrorToString] = js.native
    
    var nextState: js.UndefOr[Boolean | StateToString] = js.native
    
    var prevState: js.UndefOr[Boolean | StateToString] = js.native
    
    var title: js.UndefOr[Boolean | ActionToString] = js.native
  }
  object ColorsObject {
    
    @scala.inline
    def apply(): ColorsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorsObject]
    }
    
    @scala.inline
    implicit class ColorsObjectMutableBuilder[Self <: ColorsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction1(value: /* action */ js.Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setError(value: Boolean | ErrorToString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction2(value: (/* error */ js.Any, /* prevState */ js.Any) => String): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNextState(value: Boolean | StateToString): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextStateFunction1(value: /* state */ js.Any => String): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      @scala.inline
      def setPrevState(value: Boolean | StateToString): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevStateFunction1(value: /* state */ js.Any => String): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
      
      @scala.inline
      def setTitle(value: Boolean | ActionToString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* action */ js.Any => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type ErrorToString = js.Function2[/* error */ js.Any, /* prevState */ js.Any, String]
  
  @js.native
  trait LevelObject extends StObject {
    
    var action: js.UndefOr[String | Boolean | ActionToString] = js.native
    
    var error: js.UndefOr[String | Boolean | ErrorToString] = js.native
    
    var nextState: js.UndefOr[String | Boolean | StateToString] = js.native
    
    var prevState: js.UndefOr[String | Boolean | StateToString] = js.native
  }
  object LevelObject {
    
    @scala.inline
    def apply(): LevelObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelObject]
    }
    
    @scala.inline
    implicit class LevelObjectMutableBuilder[Self <: LevelObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String | Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction1(value: /* action */ js.Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setError(value: String | Boolean | ErrorToString): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction2(value: (/* error */ js.Any, /* prevState */ js.Any) => String): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNextState(value: String | Boolean | StateToString): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextStateFunction1(value: /* state */ js.Any => String): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      @scala.inline
      def setPrevState(value: String | Boolean | StateToString): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevStateFunction1(value: /* state */ js.Any => String): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
    }
  }
  
  @js.native
  trait LogEntryObject extends StObject {
    
    var action: js.UndefOr[String | Boolean | ActionToString] = js.native
    
    var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
    
    var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
    
    var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
    
    var started: js.UndefOr[Double] = js.native
    
    var startedTime: js.UndefOr[Date] = js.native
    
    var took: js.UndefOr[Double] = js.native
  }
  object LogEntryObject {
    
    @scala.inline
    def apply(): LogEntryObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogEntryObject]
    }
    
    @scala.inline
    implicit class LogEntryObjectMutableBuilder[Self <: LogEntryObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String | Boolean | ActionToString): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction1(value: /* action */ js.Any => String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setError(value: /* error */ js.Any => _): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setNextState(value: /* state */ js.Any => _): Self = StObject.set(x, "nextState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNextStateUndefined: Self = StObject.set(x, "nextState", js.undefined)
      
      @scala.inline
      def setPrevState(value: /* state */ js.Any => _): Self = StObject.set(x, "prevState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevStateUndefined: Self = StObject.set(x, "prevState", js.undefined)
      
      @scala.inline
      def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartedTime(value: Date): Self = StObject.set(x, "startedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartedTimeUndefined: Self = StObject.set(x, "startedTime", js.undefined)
      
      @scala.inline
      def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
      
      @scala.inline
      def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTookUndefined: Self = StObject.set(x, "took", js.undefined)
    }
  }
  
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[js.Any], 
    /* action */ js.Any, 
    /* logEntry */ js.UndefOr[LogEntryObject], 
    Boolean
  ]
  
  @js.native
  trait ReduxLoggerOptions extends StObject {
    
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
    implicit class ReduxLoggerOptionsMutableBuilder[Self <: ReduxLoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTransformer(value: /* action */ js.Any => _): Self = StObject.set(x, "actionTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionTransformerUndefined: Self = StObject.set(x, "actionTransformer", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean | LoggerPredicate): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedFunction3(
        value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "collapsed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setColors(value: ColorsObject | `false`): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffPredicate(
        value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "diffPredicate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDiffPredicateUndefined: Self = StObject.set(x, "diffPredicate", js.undefined)
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setErrorTransformer(value: /* error */ js.Any => _): Self = StObject.set(x, "errorTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorTransformerUndefined: Self = StObject.set(x, "errorTransformer", js.undefined)
      
      @scala.inline
      def setLevel(value: String | ActionToString | LevelObject): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelFunction1(value: /* action */ js.Any => String): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLogErrors(value: Boolean): Self = StObject.set(x, "logErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogErrorsUndefined: Self = StObject.set(x, "logErrors", js.undefined)
      
      @scala.inline
      def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPredicate(
        value: (/* getState */ js.Function0[js.Any], /* action */ js.Any, /* logEntry */ js.UndefOr[LogEntryObject]) => Boolean
      ): Self = StObject.set(x, "predicate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setStateTransformer(value: /* state */ js.Any => _): Self = StObject.set(x, "stateTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateTransformerUndefined: Self = StObject.set(x, "stateTransformer", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTitleFormatter(value: (/* formattedAction */ js.Any, /* formattedTime */ String, /* took */ Double) => String): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
    }
  }
  
  type StateToString = js.Function1[/* state */ js.Any, String]
  
  type _To = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Middleware[js.Object, js.Any, Dispatch[AnyAction]] = default
}
