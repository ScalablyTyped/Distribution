package typings.shipitDashUtils.shipitDashUtilsMod

import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.shipitDashCli.shipitDashCliMod.ShipitLocal
import typings.shipitDashCli.shipitDashCliMod.Tasks
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GruntOrShipit extends js.Object {
  val blTask: js.UndefOr[
    (js.Function2[
      /* name */ String, 
      (/* depsOrFn */ js.Array[String]) | (/* depsOrFn */ typings.shipitDashCli.shipitDashCliMod.EmptyCallback), 
      _
    ]) | (js.Function3[
      /* name */ String, 
      (/* depsOrFn */ js.Array[String]) | (/* depsOrFn */ typings.shipitDashCli.shipitDashCliMod.EmptyCallback), 
      /* fn */ js.Function0[Unit], 
      _
    ])
  ] = js.native
  val config: js.UndefOr[js.Object] = js.native
  val domain: js.UndefOr[js.Any] = js.native
  val doneCallback: js.UndefOr[js.Any] = js.native
  val emit: js.UndefOr[js.Function1[/* name */ String, _]] = js.native
  val environment: js.UndefOr[String] = js.native
  val initConfig: js.UndefOr[js.Function1[/* config */ js.Object, typings.shipitDashCli.Typeofshipit]] = js.native
  val isRunning: js.UndefOr[Boolean] = js.native
  val local: js.UndefOr[
    (js.Function1[/* command */ String, js.Thenable[ShipitLocal]]) | (js.Function2[/* command */ String, /* options */ ExecOptions, js.Thenable[ShipitLocal]]) | (js.Function3[
      /* command */ String, 
      /* options */ ExecOptions, 
      /* callback */ js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit], 
      js.Thenable[ShipitLocal]
    ])
  ] = js.native
  val log: js.UndefOr[js.Function1[/* log */ js.Any, Unit]] = js.native
  val on: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* e */ js.Any, Unit], _]
  ] = js.native
  val remote: js.UndefOr[
    (js.Function1[/* command */ String, js.Thenable[ShipitLocal]]) | (js.Function2[/* command */ String, /* options */ ExecOptions, js.Thenable[ShipitLocal]]) | (js.Function3[
      /* command */ String, 
      /* options */ ExecOptions, 
      /* callback */ js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit], 
      js.Thenable[ShipitLocal]
    ])
  ] = js.native
  val remoteCopy: js.UndefOr[
    (js.Function2[/* src */ String, /* dest */ String, js.Thenable[ShipitLocal]]) | (js.Function3[
      /* src */ String, 
      /* dest */ String, 
      /* options */ ExecOptions, 
      js.Thenable[ShipitLocal]
    ]) | (js.Function4[
      /* src */ String, 
      /* dest */ String, 
      /* options */ ExecOptions, 
      /* callback */ js.Function3[/* error */ Error, /* stdout */ String, /* stderr */ String, Unit], 
      js.Thenable[ShipitLocal]
    ])
  ] = js.native
  val seq: js.UndefOr[js.Array[_]] = js.native
  val start: js.UndefOr[
    js.Function1[
      (/* tasks */ js.Array[String]) | (/* tasks */ String), 
      typings.shipitDashCli.Typeofshipit
    ]
  ] = js.native
  val task: js.UndefOr[
    (js.Function2[
      /* name */ String, 
      (/* depsOrFn */ js.Array[String]) | (/* depsOrFn */ typings.shipitDashCli.shipitDashCliMod.EmptyCallback), 
      typings.shipitDashCli.Typeofshipit
    ]) | (js.Function3[
      /* name */ String, 
      (/* depsOrFn */ js.Array[String]) | (/* depsOrFn */ typings.shipitDashCli.shipitDashCliMod.EmptyCallback), 
      /* fn */ js.Function0[Unit], 
      typings.shipitDashCli.Typeofshipit
    ])
  ] = js.native
  val tasks: js.UndefOr[Tasks] = js.native
}

