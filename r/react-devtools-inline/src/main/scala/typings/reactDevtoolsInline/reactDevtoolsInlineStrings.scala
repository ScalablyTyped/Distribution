package typings.reactDevtoolsInline

import typings.reactDevtoolsInline.commonsMod.BrowserTheme
import typings.reactDevtoolsInline.commonsMod.HookEvents
import typings.reactDevtoolsInline.commonsMod.PathType
import typings.reactDevtoolsInline.commonsMod.Phase
import typings.reactDevtoolsInline.commonsMod.ReactComponentMeasureType
import typings.reactDevtoolsInline.commonsMod.ReactMeasureType
import typings.reactDevtoolsInline.commonsMod.TabID
import typings.reactDevtoolsInline.commonsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDevtoolsInlineStrings {
  
  @js.native
  sealed trait commit
    extends StObject
       with ReactMeasureType
  inline def commit: commit = "commit".asInstanceOf[commit]
  
  @js.native
  sealed trait components
    extends StObject
       with TabID
  inline def components: components = "components".asInstanceOf[components]
  
  @js.native
  sealed trait context
    extends StObject
       with PathType
       with Type
  inline def context: context = "context".asInstanceOf[context]
  
  @js.native
  sealed trait dark
    extends StObject
       with BrowserTheme
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fastRefreshScheduled
    extends StObject
       with HookEvents
  inline def fastRefreshScheduled: fastRefreshScheduled = "fastRefreshScheduled".asInstanceOf[fastRefreshScheduled]
  
  @js.native
  sealed trait `full-data` extends StObject
  inline def `full-data`: `full-data` = "full-data".asInstanceOf[`full-data`]
  
  @js.native
  sealed trait hooks
    extends StObject
       with PathType
       with Type
  inline def hooks: hooks = "hooks".asInstanceOf[hooks]
  
  @js.native
  sealed trait `hydrated-path` extends StObject
  inline def `hydrated-path`: `hydrated-path` = "hydrated-path".asInstanceOf[`hydrated-path`]
  
  @js.native
  sealed trait `layout-effect-mount`
    extends StObject
       with ReactComponentMeasureType
  inline def `layout-effect-mount`: `layout-effect-mount` = "layout-effect-mount".asInstanceOf[`layout-effect-mount`]
  
  @js.native
  sealed trait `layout-effect-unmount`
    extends StObject
       with ReactComponentMeasureType
  inline def `layout-effect-unmount`: `layout-effect-unmount` = "layout-effect-unmount".asInstanceOf[`layout-effect-unmount`]
  
  @js.native
  sealed trait `layout-effects`
    extends StObject
       with ReactMeasureType
  inline def `layout-effects`: `layout-effects` = "layout-effects".asInstanceOf[`layout-effects`]
  
  @js.native
  sealed trait light
    extends StObject
       with BrowserTheme
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait mount
    extends StObject
       with Phase
  inline def mount: mount = "mount".asInstanceOf[mount]
  
  @js.native
  sealed trait `no-change` extends StObject
  inline def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  
  @js.native
  sealed trait `not-found` extends StObject
  inline def `not-found`: `not-found` = "not-found".asInstanceOf[`not-found`]
  
  @js.native
  sealed trait operations
    extends StObject
       with HookEvents
  inline def operations: operations = "operations".asInstanceOf[operations]
  
  @js.native
  sealed trait `passive-effect-mount`
    extends StObject
       with ReactComponentMeasureType
  inline def `passive-effect-mount`: `passive-effect-mount` = "passive-effect-mount".asInstanceOf[`passive-effect-mount`]
  
  @js.native
  sealed trait `passive-effect-unmount`
    extends StObject
       with ReactComponentMeasureType
  inline def `passive-effect-unmount`: `passive-effect-unmount` = "passive-effect-unmount".asInstanceOf[`passive-effect-unmount`]
  
  @js.native
  sealed trait `passive-effects`
    extends StObject
       with ReactMeasureType
  inline def `passive-effects`: `passive-effects` = "passive-effects".asInstanceOf[`passive-effects`]
  
  @js.native
  sealed trait profiler
    extends StObject
       with TabID
  inline def profiler: profiler = "profiler".asInstanceOf[profiler]
  
  @js.native
  sealed trait props
    extends StObject
       with PathType
       with Type
  inline def props: props = "props".asInstanceOf[props]
  
  @js.native
  sealed trait `react-devtools`
    extends StObject
       with HookEvents
  inline def `react-devtools`: `react-devtools` = "react-devtools".asInstanceOf[`react-devtools`]
  
  @js.native
  sealed trait rejected extends StObject
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait render
    extends StObject
       with ReactComponentMeasureType
       with ReactMeasureType
  inline def render: render = "render".asInstanceOf[render]
  
  @js.native
  sealed trait `render-idle`
    extends StObject
       with ReactMeasureType
  inline def `render-idle`: `render-idle` = "render-idle".asInstanceOf[`render-idle`]
  
  @js.native
  sealed trait renderer
    extends StObject
       with HookEvents
  inline def renderer: renderer = "renderer".asInstanceOf[renderer]
  
  @js.native
  sealed trait `renderer-attached`
    extends StObject
       with HookEvents
  inline def `renderer-attached`: `renderer-attached` = "renderer-attached".asInstanceOf[`renderer-attached`]
  
  @js.native
  sealed trait resolved extends StObject
  inline def resolved: resolved = "resolved".asInstanceOf[resolved]
  
  @js.native
  sealed trait `schedule-force-update` extends StObject
  inline def `schedule-force-update`: `schedule-force-update` = "schedule-force-update".asInstanceOf[`schedule-force-update`]
  
  @js.native
  sealed trait `schedule-render` extends StObject
  inline def `schedule-render`: `schedule-render` = "schedule-render".asInstanceOf[`schedule-render`]
  
  @js.native
  sealed trait `schedule-state-update` extends StObject
  inline def `schedule-state-update`: `schedule-state-update` = "schedule-state-update".asInstanceOf[`schedule-state-update`]
  
  @js.native
  sealed trait shutdown
    extends StObject
       with HookEvents
  inline def shutdown: shutdown = "shutdown".asInstanceOf[shutdown]
  
  @js.native
  sealed trait state
    extends StObject
       with PathType
       with Type
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait suspense extends StObject
  inline def suspense: suspense = "suspense".asInstanceOf[suspense]
  
  @js.native
  sealed trait `thrown-error` extends StObject
  inline def `thrown-error`: `thrown-error` = "thrown-error".asInstanceOf[`thrown-error`]
  
  @js.native
  sealed trait traceUpdates
    extends StObject
       with HookEvents
  inline def traceUpdates: traceUpdates = "traceUpdates".asInstanceOf[traceUpdates]
  
  @js.native
  sealed trait uncaught extends StObject
  inline def uncaught: uncaught = "uncaught".asInstanceOf[uncaught]
  
  @js.native
  sealed trait `unknown-hook` extends StObject
  inline def `unknown-hook`: `unknown-hook` = "unknown-hook".asInstanceOf[`unknown-hook`]
  
  @js.native
  sealed trait unresolved extends StObject
  inline def unresolved: unresolved = "unresolved".asInstanceOf[unresolved]
  
  @js.native
  sealed trait `unsupported-renderer-version`
    extends StObject
       with HookEvents
  inline def `unsupported-renderer-version`: `unsupported-renderer-version` = "unsupported-renderer-version".asInstanceOf[`unsupported-renderer-version`]
  
  @js.native
  sealed trait update
    extends StObject
       with Phase
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait user extends StObject
  inline def user: user = "user".asInstanceOf[user]
}
