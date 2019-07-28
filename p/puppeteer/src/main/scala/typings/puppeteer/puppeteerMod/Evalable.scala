package typings.puppeteer.puppeteerMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evalable extends js.Object {
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within the context and passes it as the
    * first argument to `pageFunction`.
    *
    * If `pageFunction` returns a Promise, then `$$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$$eval")
  def $$eval[R](selector: String, pageFunction: js.Function1[/* elements */ js.Array[Element], R | js.Promise[R]]): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within the context and passes it as the
    * first argument to `pageFunction`.
    *
    * If `pageFunction` returns a Promise, then `$$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param args Arguments to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$$eval")
  def $$eval[R](
    selector: String,
    pageFunction: js.Function2[/* elements */ js.Array[Element], /* repeated */ js.Any, R | js.Promise[R]],
    args: SerializableOrJSHandle*
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within the context and passes it as the
    * first argument to `pageFunction`.
    *
    * If `pageFunction` returns a Promise, then `$$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$$eval")
  def $$eval[R, X1](
    selector: String,
    pageFunction: js.Function2[
      /* elements */ js.Array[Element], 
      /* x1 */ UnwrapElementHandle[X1], 
      R | js.Promise[R]
    ],
    x1: X1
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within the context and passes it as the
    * first argument to `pageFunction`.
    *
    * If `pageFunction` returns a Promise, then `$$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @param x2 Second argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$$eval")
  def $$eval[R, X1, X2](
    selector: String,
    pageFunction: js.Function3[
      /* elements */ js.Array[Element], 
      /* x1 */ UnwrapElementHandle[X1], 
      /* x2 */ UnwrapElementHandle[X2], 
      R | js.Promise[R]
    ],
    x1: X1,
    x2: X2
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within the context and passes it as the
    * first argument to `pageFunction`.
    *
    * If `pageFunction` returns a Promise, then `$$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @param x2 Second argument to pass to pageFunction
    * @param x3 Third argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$$eval")
  def $$eval[R, X1, X2, X3](
    selector: String,
    pageFunction: js.Function4[
      /* elements */ js.Array[Element], 
      /* x1 */ UnwrapElementHandle[X1], 
      /* x2 */ UnwrapElementHandle[X2], 
      /* x3 */ UnwrapElementHandle[X3], 
      R | js.Promise[R]
    ],
    x1: X1,
    x2: X2,
    x3: X3
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `document.querySelector` within the context and passes it as the first argument to `pageFunction`.
    * If there's no element matching `selector`, the method throws an error.
    *
    * If `pageFunction` returns a Promise, then `$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$eval")
  def $eval[R](selector: String, pageFunction: js.Function1[/* element */ Element, R | js.Promise[R]]): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `document.querySelector` within the context and passes it as the first argument to `pageFunction`.
    * If there's no element matching `selector`, the method throws an error.
    *
    * If `pageFunction` returns a Promise, then `$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param args Arguments to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$eval")
  def $eval[R](
    selector: String,
    pageFunction: js.Function2[/* element */ Element, /* repeated */ js.Any, R | js.Promise[R]],
    args: SerializableOrJSHandle*
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `document.querySelector` within the context and passes it as the first argument to `pageFunction`.
    * If there's no element matching `selector`, the method throws an error.
    *
    * If `pageFunction` returns a Promise, then `$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$eval")
  def $eval[R, X1](
    selector: String,
    pageFunction: js.Function2[/* element */ Element, /* x1 */ UnwrapElementHandle[X1], R | js.Promise[R]],
    x1: X1
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `document.querySelector` within the context and passes it as the first argument to `pageFunction`.
    * If there's no element matching `selector`, the method throws an error.
    *
    * If `pageFunction` returns a Promise, then `$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @param x2 Second argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$eval")
  def $eval[R, X1, X2](
    selector: String,
    pageFunction: js.Function3[
      /* element */ Element, 
      /* x1 */ UnwrapElementHandle[X1], 
      /* x2 */ UnwrapElementHandle[X2], 
      R | js.Promise[R]
    ],
    x1: X1,
    x2: X2
  ): js.Promise[WrapElementHandle[R]] = js.native
  /**
    * This method runs `document.querySelector` within the context and passes it as the first argument to `pageFunction`.
    * If there's no element matching `selector`, the method throws an error.
    *
    * If `pageFunction` returns a Promise, then `$eval` would wait for the promise to resolve and return its value.
    *
    * @param selector A selector to query for
    * @param pageFunction Function to be evaluated in browser context
    * @param x1 First argument to pass to pageFunction
    * @param x2 Second argument to pass to pageFunction
    * @param x3 Third argument to pass to pageFunction
    * @returns Promise which resolves to the return value of pageFunction
    */
  @JSName("$eval")
  def $eval[R, X1, X2, X3](
    selector: String,
    pageFunction: js.Function4[
      /* element */ Element, 
      /* x1 */ UnwrapElementHandle[X1], 
      /* x2 */ UnwrapElementHandle[X2], 
      /* x3 */ UnwrapElementHandle[X3], 
      R | js.Promise[R]
    ],
    x1: X1,
    x2: X2,
    x3: X3
  ): js.Promise[WrapElementHandle[R]] = js.native
}

