package typings.serverlessJestPlugin.mod

import org.scalablytyped.runtime.TopLevel
import typings.awsLambda.handlerMod.Callback
import typings.lambdaWrapper.anon.Handler
import typings.lambdaWrapper.anon.LambdaFunction
import typings.lambdaWrapper.anon.PartialContext
import typings.lambdaWrapper.mod.Wrapped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless-jest-plugin", "lambdaWrapper")
@js.native
object lambdaWrapper extends js.Object {
  def init(mod: js.Any, options: js.Any): Unit = js.native
  def run(event: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def run(event: js.Any, context: PartialContext, callback: Callback[_]): js.Promise[_] = js.native
  def wrap(mod: LambdaFunction): Wrapped[_, _] = js.native
  def wrap(mod: LambdaFunction, options: js.Object): Wrapped[_, _] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.serverlessJestPlugin.serverlessJestPluginStrings.lambdaWrapper with TopLevel[js.Any]
  ): Wrapped[TEvent, TResult] = js.native
  def wrap[TEvent, TResult, THandlerName /* <: String */](
    mod: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in THandlerName ]: aws-lambda.aws-lambda/handler.Handler<TEvent, TResult>}
    */ typings.serverlessJestPlugin.serverlessJestPluginStrings.lambdaWrapper with TopLevel[js.Any],
    options: Handler[THandlerName]
  ): Wrapped[TEvent, TResult] = js.native
}

