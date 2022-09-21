package typings.righto

import org.scalablytyped.runtime.TopLevel
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Righto constructor to allow for two righto.after statements to appear, once before the argument list and once after
  inline def apply[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET](
    fn: CPSFunction[AT, RT, ET],
    after: RightoAfter,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...ArgsAsFlexible<AT, ET>, RightoAfter] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>}
    */ typings.righto.rightoStrings.^ & TopLevel[AT]
    ]
  ): Righto[RT, ET] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], after.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[RT, ET]]
  // Righto constructor to allow for a single righto.after to appear before the function arguments
  inline def apply[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET](
    fn: CPSFunction[AT, RT, ET],
    after: RightoAfter,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsAsFlexible<AT, ET> is not an array type */ args: ArgsAsFlexible[AT, ET]
  ): Righto[RT, ET] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], after.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[RT, ET]]
  // Righto constructor to allow for a single righto.after to appear after the function arguments
  inline def apply[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET](
    fn: CPSFunction[AT, RT, ET],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...ArgsAsFlexible<AT, ET>, RightoAfter] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>}
    */ typings.righto.rightoStrings.^ & TopLevel[AT]
    ]
  ): Righto[RT, ET] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[RT, ET]]
  /**
    * Constructor for a righto object. Accepts a CPS function to represent the async task, followed by the arguments to the CPS function excluding the callback.
    * @example
    * function divideNumbersAsync(a: number, b: number, callback: (error?: Error, result?: number) => void) {
    *     setTimeout(() => {
    *         if (b === 0) callback(new Error("Cannot divide by zero"));
    *         else callback(undefined, a / b);
    *     }, 1000);
    * }
    *
    * let rResult = righto(divideNumbersAsync, 2, 1); // A righto object that will eventually resolve to 2
    * rResult((err, result) => console.log(result)); // Will print '2' to the console
    *
    * // You can also pass eventuals as arguments to the CPS function and they will automatically be resolved
    * let rResult2 = righto(divideNumbersAsync, 5, rResult); // A righto object that will eventually resolve to 2.5
    * rResult2((err, result) => console.log(result)); // Will print '2.5' to the console
    */
  inline def apply[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET](
    fn: CPSFunction[AT, RT, ET],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsAsFlexible<AT, ET> is not an array type */ args: ArgsAsFlexible[AT, ET]
  ): Righto[RT, ET] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[RT, ET]]
  
  @JSImport("righto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sometimes you need a task to run after another has succeeded, but you don't need its results, righto.after(task1, task2, taskN...) can be used to achieve this.
    * @param rightos The tasks to wait on
    * @example
    * function foo(callback){
    *     setTimeout(function(){
    *         callback(null, 'first result');
    *     }, 1000);
    * }
    * var getFoo = righto(foo);
    * function bar(callback){
    *     callback(null, 'second result');
    * }
    * var getBar = righto(bar, righto.after(getFoo)); // wait for foo before running bar.
    * getBar(function(error, result){
    *     result -> 'second result';
    * });
    */
  inline def after(rightos: (Righto[Any, Any])*): RightoAfter = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(rightos.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RightoAfter]
  
  inline def all(tasks: js.Array[Righto[Any, Any]]): Righto[js.Array[js.Array[Any]], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(tasks.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[js.Array[Any]], Any]]
  
  /**
    * righto.all takes N tasks, or an Array of tasks as the first argument, resolves them all in parallel, and results in an Array of results.
    * @param tasks The tasks to resolve
    * @example
    * var task1 = righto(function(done){
    *     setTimeout(function(){
    *         done(null, 'a');
    *     }, 1000);
    * });
    *
    * var task2 = righto(function(done){
    *     setTimeout(function(){
    *         done(null, 'b');
    *     }, 1000);
    * });
    *
    * var task3 = righto(function(done){
    *     setTimeout(function(){
    *         done(null, 'c');
    *     }, 1000);
    * });
    *
    * var all = righto.all([task1, task2, task3]);
    *
    * all(function(error, results){
    *     results; // -> ['a','b','c']
    * });
    */
  inline def all_RTET[RT, ET](tasks: js.Array[Righto[js.Array[RT], ET]]): Righto[js.Array[js.Array[RT]], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(tasks.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[js.Array[RT]], ET]]
  
  /**
    * You can globally tell righto to print a graph trace, highlighting the offending task, when a graph rejects.
    */
  @JSImport("righto", "_autotraceOnError")
  @js.native
  def autotraceOnError: Boolean = js.native
  
  inline def autotraceOnError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_autotraceOnError")(x.asInstanceOf[js.Any])
  
  /**
    * Enables or disables debug logging. When true, stack traces can be retrieved from each righto object using [righto instance].trace();
    * @example
    * righto._debug = true;
    * var someRighto = righto.from(a);
    * someRighto.trace();
    */
  @JSImport("righto", "_debug")
  @js.native
  def debug: Boolean = js.native
  
  inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debug")(x.asInstanceOf[js.Any])
  
  /**
    * A shorthand way to provide a failed result. This is handy for rejecting in .get methods.
    * @param err The error to throw
    * @example
    * var something = someRighto.get(function(value){
    *   if(!value){
    *     return righto.fail('was falsey');
    *   }
    *   return value;
    * });
    */
  inline def fail[ET](err: ET): Righto[js.Array[Any], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(err.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[Any], ET]]
  
  /**
    * Forks a righto into a callback suitable for the promise constructor
    * @param righto Righto to fork
    * @example
    * var somePromise = new Promise(righto.fork(someRighto));
    */
  inline def fork[RT /* <: js.Array[Any] */](righto: Righto[RT, Any]): js.Function2[
    /* resolve */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: RT[0] */ /* x */ js.Any, 
      Unit
    ], 
    /* reject */ js.Function1[/* x */ Any, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(righto.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* resolve */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: RT[0] */ /* x */ js.Any, 
      Unit
    ], 
    /* reject */ js.Function1[/* x */ Any, Unit], 
    Unit
  ]]
  
  inline def from[T](source: T): Righto[js.Array[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[T], Unit]]
  inline def from[T, ET](source: js.Promise[T]): Righto[js.Array[T], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[T], ET]]
  /**
    * Anything can be converted to a righto with righto.from(anything);
    * @param source The source object to create a righto from
    * @example
    * righto.from(someRighto); // Returns someRighto
    * righto.from(somePromise); // Returns a new righto that resolves the promise
    * righto.from(5); // Returns a new righto that resolves 5
    */
  inline def from[T, ET](source: Righto[js.Array[T], ET]): Righto[js.Array[T], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[T], ET]]
  
  /**
    * Wrap a righto task with a handler that either forwards the successful result, or sends the rejected error through a handler to resolve the task.
    * @param righto The righto that may throw an error
    * @param handler The error handler
    * @example
    * function mightFail(callback){
    *     if(Math.random() > 0.5){
    *         callback('borked');
    *     }else{
    *         callback(null, 'result');
    *     }
    * };
    *
    * function defaultString(error, callback){
    *     callback(null, '');
    * }
    *
    * var maybeAString = righto(mightFail),
    *     aString = righto.handle(maybeAString, defaultString);
    *
    * aString(function(error, result){
    *     typeof result === 'string';
    * });
    */
  inline def handle[RT /* <: js.Array[Any] */, ET](righto: Righto[RT, ET], handler: CPSFunction[js.Array[ET], RT, ET]): Righto[RT, ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(righto.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Righto[RT, ET]]
  
  /** Determines whether an object is a righto or thenable */
  inline def isResolvable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResolvable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Determines whether an object is a righto */
  inline def isRighto(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRighto")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Determines whether an object supports the promise-like `x.then(y => ...)` resolution syntax */
  inline def isThenable(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Righto supports running a generator (or any nextable iterator):
    * @param iterator The iterator to run
    * @example
    * var generated = righto.iterate(function*(a, b, c){
    *     var x = yield righto(function(done){
    *         setTimeout(function(){
    *             done(null, 'x');
    *         });
    *     });
    *
    *     var y = yield righto(function(done){
    *         setTimeout(function(){
    *             done(null, 'y');
    *         });
    *     });
    *
    *     return x + y + a + b + c;
    * });
    *
    * var result = generated('a', 'b', 'c');
    *
    * result(function(error, result){
    *     result === 'xyabc';
    * });
    */
  inline def iterate[AT /* <: js.Array[Any] */, RT, ET](constructGenerator: js.Function1[/* args */ AT, Generator[Righto[js.Array[RT], ET], RT, RT]]): js.Function1[/* args */ AT, Righto[js.Array[RT], ET]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(constructGenerator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ AT, Righto[js.Array[RT], ET]]]
  
  /**
    * Occasionally you might want to mate a number of tasks into one task.
    * For this, you can use righto.mate.
    * @param rightos List of righto's to mate
    * @example
    * function getStuff(callback){
    *     // eventually...
    *     callback(null, 3);
    * }
    * var stuff = righto(getStuff);
    * function getOtherStuff(callback){
    *     // eventually...
    *     callback(null, 7);
    * }
    * var otherStuff = righto(getOtherStuff);
    * var stuffAndOtherStuff = righto.mate(stuff, otherStuff);
    * stuffAndOtherStuff(function(error, stuff, otherStuff){
    *     error -> null
    *     stuff -> 3
    *     otherStuff -> 7
    * });
    */
  inline def mate[RT /* <: js.Array[Any] */, ET](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rightos because its type RightoArrayFrom<RT, ET> is not an array type */ rightos: RightoArrayFrom[RT, ET]
  ): Righto[RT, ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("mate")(rightos.asInstanceOf[js.Any]).asInstanceOf[Righto[RT, ET]]
  
  /**
    * If you are using righto in an environment that supports proxies, you can use the proxy API
    * @example
    * var righto = require('righto').proxy;
    *
    * var foo = righto(function(done){
    *         setTimeout(function(){
    *             done(null, {foo: 'bar'});
    *         });
    *     });
    *
    * foo.bar(function(error, bar){
    *     bar === 'bar'
    * });
    */
  inline def proxy[AT /* <: js.Array[Any] */](
    fn: CPSFunction[AT, js.Array[Any], Any],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AT is not an array type */ args: AT
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Righto.reduce takes an Array of values (an an eventual that resolves to an array) as the first argument, resolves them from left-to-right,
    * optionally passing the result of the last, and the next task to a reducer.
    * When no reducer is passed, the tasks will be resolved in series, and the final tasks result will be passed as the result from reduce.
    * If no tasks are passed, the final result will be undefined.
    * @param values The rightos to reduce
    * @example
    * function a(callback){
    *     aCalled = true;
    *     t.pass('a called');
    *     callback(null, 1);
    * }
    * function b(callback){
    *     t.ok(aCalled, 'b called after a');
    *     callback(null, 2);
    * }
    * var result = righto.reduce([righto(a), righto(b)]);
    * result(function(error, finalResult){
    *     // finalResult === 2
    * });
    */
  inline def reduce[RT, ET](values: js.Array[Righto[js.Array[RT], ET]]): Righto[js.Array[RT], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(values.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[RT], ET]]
  /**
    * Righto.reduce takes an Array of values (an an eventual that resolves to an array) as the first argument, resolves them from left-to-right,
    * optionally passing the result of the last, and the next task to a reducer.
    * When a reducer is used, a seed can optionally be passed as the third parameter.
    * If no tasks are passed, the final result will be undefined.
    * @param values The functions to reduce
    * @param reducer The reducer function
    * @param seed The initial value for the reducer function
    * @example
    * function a(last, callback){
    *     aCalled = true;
    *     t.pass('a called');
    *     callback(null, last);
    * }
    *
    * function b(last, callback){
    *     t.ok(aCalled, 'b called after a');
    *     callback(null, last + 2);
    * }
    *
    * // Passes previous eventual result to next reducer call.
    * var result = righto.reduce(
    *         [a, b],
    *         function(result, next){ // Reducer
    *             return righto(next, result);
    *         },
    *         5 // Seed
    *     );
    *
    * result(function(error, finalResult){
    *     // finalResult === 7
    * });
    */
  inline def reduce[RT, ET](
    values: js.Array[CPSFunction[js.Array[RT], js.Array[RT], ET]],
    reducer: js.Function2[
      /* result */ RT, 
      /* next */ CPSFunction[js.Array[RT], js.Array[RT], ET], 
      Righto[js.Array[RT], ET]
    ]
  ): Righto[js.Array[RT], ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(values.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[Righto[js.Array[RT], ET]]
  inline def reduce[RT, ET](
    values: js.Array[CPSFunction[js.Array[RT], js.Array[RT], ET]],
    reducer: js.Function2[
      /* result */ RT, 
      /* next */ CPSFunction[js.Array[RT], js.Array[RT], ET], 
      Righto[js.Array[RT], ET]
    ],
    seed: RT
  ): Righto[js.Array[RT], ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(values.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Righto[js.Array[RT], ET]]
  
  inline def resolve[T](obj: T): ResolvedObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(obj.asInstanceOf[js.Any]).asInstanceOf[ResolvedObject[T]]
  /**
    * Resolves an object to a new object where any righto values are resolved.
    * @param obj Object to resolve
    * @param recursive Whether or not to recursively resolve objects
    * @example
    * var foo = righto(function(callback){
    *     asyncify(function(){
    *         callback(null, 'foo');
    *     });
    * });
    * var bar = righto.resolve({foo: {bar: foo}}, true);
    * bar(function(error, bar){
    *     bar; // -> {foo: {bar: 'foo'}}
    * });
    */
  inline def resolve[T, B /* <: Boolean */](obj: T, recursive: B): ResolvedObject[T] | ResolvedObjectRecursive[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(obj.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[ResolvedObject[T] | ResolvedObjectRecursive[T]]
  
  /**
    * You can resolve a task to an array containing either the error or results from a righto with righto.surely, which resolves to an array in the form of [error?, results...?].
    * @param fn The function to process
    * @param args The arguments to the function
    * @example
    * var errorOrX = righto.surely(function(done){
    *         done(new Error('borked'));
    *     });
    *
    * var errorOrY = righto.surely(function(done){
    *         done(null, 'y');
    *     });
    *
    * var z = righto(function([xError, x], [yError, y]){
    *
    *         xError; // -> Error 'borked'
    *         x; // -> undefined
    *         yError; // -> null
    *         y; // -> 'y'
    *
    *     }, errorOrX, errorOrY);
    *
    * z();
    */
  inline def surely[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET](
    fn: CPSFunction[AT, RT, ET],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsAsFlexible<AT, ET> is not an array type */ args: ArgsAsFlexible[AT, ET]
  ): Righto[
    js.Array[
      /* import warning: importer.ImportType#apply c repeated non-array type: RT */ js.Array[RT]
    ], 
    ET
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("surely")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[
    js.Array[
      /* import warning: importer.ImportType#apply c repeated non-array type: RT */ js.Array[RT]
    ], 
    ET
  ]]
  
  inline def sync[AT /* <: js.Array[Any] */, RT, ET](
    fn: js.Function1[/* args */ AT, RT],
    after: RightoAfter,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...ArgsAsFlexible<AT, ET>, RightoAfter] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>}
    */ typings.righto.rightoStrings.sync & TopLevel[AT]
    ]
  ): Righto[js.Array[RT], ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fn.asInstanceOf[js.Any], after.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[js.Array[RT], ET]]
  inline def sync[AT /* <: js.Array[Any] */, RT, ET](
    fn: js.Function1[/* args */ AT, RT],
    after: RightoAfter,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsAsFlexible<AT, ET> is not an array type */ args: ArgsAsFlexible[AT, ET]
  ): Righto[js.Array[RT], ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fn.asInstanceOf[js.Any], after.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[js.Array[RT], ET]]
  /**
    * Synchronous functions can be used to create righto tasks using righto.sync:
    * @param fn Synchronous function
    * @param after Optional null righto argument, used for passing in a righto.after object, if required
    * @param args Arguments to synchronous function, as either resolved types or eventuals (righto or promise)
    * @example
    * var someNumber = righto(function(done){
    *     setTimeout(function(){
    *         done(null, 5);
    *     }, 1000);
    * }
    * function addFive(value){
    *     return value + 5;
    * }
    * var syncTask = righto.sync(addFive, someNumber);
    * syncTask(function(error, result){
    *     result; // -> 10
    * });
    */
  inline def sync[AT /* <: js.Array[Any] */, RT, ET](
    fn: js.Function1[/* args */ AT, RT],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsAsFlexible<AT, ET> is not an array type */ args: ArgsAsFlexible[AT, ET]
  ): Righto[js.Array[RT], ET] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[js.Array[RT], ET]]
  
  /**
    * You can pick and choose what results are used from a dependency like so:
    * @param righto The righto to take results from
    * @param args The (0-indexed) position of each argument to take
    * @example
    * var getBar = righto(bar, righto.take(getFoo, 0, 2)); // Take result 0, and result 2, from getFoo
    * getBar(function(error, result){
    *     result -> 'first third';
    * });
    */
  inline def take[IDXS /* <: js.Array[Double] */, ET](
    righto: Righto[js.Array[Any], ET],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type IDXS is not an array type */ args: IDXS
  ): Righto[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof IDXS ]: any}
    */ typings.righto.rightoStrings.take & TopLevel[Any], 
    ET
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(righto.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Righto[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof IDXS ]: any}
    */ typings.righto.rightoStrings.take & TopLevel[Any], 
    ET
  ]]
  
  inline def value[T, ET](resolvable: js.Promise[T]): Righto[js.Array[Righto[js.Array[T], ET]], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(resolvable.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[Righto[js.Array[T], ET]], ET]]
  /**
    * Sometimes it may be required to pass a resolvable (a righto, or promise) as an argument rather than passing the resolved value of the resolvable. you can do this using righto.value(resolvable)
    * @param resolvable The resolvable to wrap
    * @example
    * var righto1 = righto(function(done){
    *         done(null, 5);
    *     });
    *
    * var rightoValue = righto.value(righto1);
    *
    * var righto2 = righto(function(value, done){
    *         // value === righto1
    *
    *         value(function(error, x){
    *             // x === 5;
    *         });
    *
    *     }, rightoValue);
    *
    * righto2();
    */
  inline def value[T, ET](resolvable: Righto[js.Array[T], ET]): Righto[js.Array[Righto[js.Array[T], ET]], ET] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(resolvable.asInstanceOf[js.Any]).asInstanceOf[Righto[js.Array[Righto[js.Array[T], ET]], ET]]
  
  /** Accepts an array of types and returns a array of each type OR'd with eventual representations (Righto and promise) */
  type ArgsAsFlexible[AT /* <: js.Array[Any] */, ET] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof AT ]: righto.righto.Flexible<AT[T], ET>}
    */ typings.righto.rightoStrings.ArgsAsFlexible & TopLevel[AT]
  
  /**  Usually an async function that accepts any number of parameters, then returns a result or error through an ErrBack method */
  type CPSFunction[AT /* <: js.Array[Any] */, RT /* <: js.Array[Any] */, ET] = js.Function1[
    /* import warning: importer.ImportType#apply c repeated non-array type: AT */ /* args */ js.Array[AT], 
    Unit
  ]
  
  /** A callback function that accepts a single error argument, with any number of return arguments */
  type ErrBack[RT /* <: js.Array[Any] */, ET] = js.Function2[
    /* err */ js.UndefOr[ET], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof RT ]:? RT[P]}
    */ /* results */ typings.righto.rightoStrings.ErrBack & TopLevel[RT], 
    Unit
  ]
  
  /** Represents a type as either the type itself, a righto of the type, or a promise of the type */
  type Flexible[T, ET] = T | js.Promise[T] | (Righto[Array[js.UndefOr[T | Any]], ET])
  
  /** Transforms an object type to unwrap its Righto typed properties */
  type ResolvedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends righto.righto.Righto<infer X, any>? any[0] : T[P]}
    */ typings.righto.rightoStrings.ResolvedObject & TopLevel[Any]
  
  /** Recursively transforms an object type to unwrap its Righto typed properties into "unknown" */
  type ResolvedObjectRecursive[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends righto.righto.Righto<infer X, any>? any[0] : T[P] extends object? righto.righto.ResolvedObjectRecursive<T[P]> : T[P]}
    */ typings.righto.rightoStrings.ResolvedObjectRecursive & TopLevel[Any]
  
  /** Represents a constructed righto object */
  @js.native
  trait Righto[RT /* <: js.Array[Any] */, ET]
    extends CPSFunction[js.Array[Any], RT, ET] {
    
    /** You can force a righto task for run at any time without dealing with the results (or error) by calling it with no arguments */
    def apply(): Righto[RT, ET] = js.native
    
    /** Prints a stack trace for this righto to the console. Only works if righto._debug was set to true *before* instantiating this righto */
    def _trace(): Unit = js.native
    
    /** When true, this righto will print a graph trace if it rejects, highlighting the offending task. */
    var _traceOnError: Boolean = js.native
    
    def get(prop: String): Righto[js.Array[Any], ET] = js.native
    def get(prop: Double): Righto[js.Array[Any], ET] = js.native
    def get(prop: Righto[Array[Any | Double | String], Any]): Righto[js.Array[Any], ET] = js.native
    @JSName("get")
    def get_0[T](
      fn: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: RT[0] */ /* x */ js.Any, 
          T
        ]
    ): Righto[js.Array[T], ET] = js.native
  }
  
  /** A righto that does not resolve to any value, used for introducing delays in righto argument chains */
  type RightoAfter = Righto[js.Array[Any], Any]
  
  /** Maps an array of types into their righto representations */
  type RightoArrayFrom[T /* <: js.Array[Any] */, ET] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: righto.righto.Righto<[T[P]], ET>}
    */ typings.righto.rightoStrings.RightoArrayFrom & TopLevel[T]
}
