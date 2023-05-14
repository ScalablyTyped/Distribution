organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20211202Z-dd1f73"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-b59ec6",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-573941",
  "org.scalablytyped" %%% "anymatch" % "3.1.3-0a75c9",
  "org.scalablytyped" %%% "async" % "3.2-dt-20230426Z-2a5958",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-329706",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-62a45e",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-b89d67",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8fb2b2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-80b886",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-a804fc",
  "org.scalablytyped" %%% "jsonwebtoken" % "9.0-dt-20230427Z-0e0ab1",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-75528c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-7e3986",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-6c7759",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-179e49",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-982202",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-7a6ac9",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-68818e",
  "org.scalablytyped" %%% "socketcluster-server" % "17.3-dt-20230213Z-06ea33",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-e10c4b",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-cdee41",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
