organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20191015Z-d83079"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20191126Z-62632c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-2bc65c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1799fb",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-358478",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        