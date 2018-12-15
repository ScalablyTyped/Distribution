organization := "org.scalablytyped"
name := "socketcluster"
version := "14.0-dt-20181205Z-07c718"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-39a9cc",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-470938",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-ffc9d2",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181205Z-c55c9f",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bb7698")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        