organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20190322Z-02987e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "pg" % "7.11-dt-20190816Z-f7af25",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-7204e7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-ff56fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        